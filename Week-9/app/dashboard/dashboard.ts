import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { EmployeeService } from '../service/employee-service';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  imports: [CommonModule],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css',
})
export class Dashboard {
  userResp: any;
  id: any;
  constructor(private employeeService: EmployeeService,private   route:Router,private activateRouter:ActivatedRoute
   ) {}
  employees: any;
public ngOnInit() {
  // Logic to fetch and display the list of employees
  this.getEmployees();
  
	 
 
}
public getEmployees() {
  // Logic to fetch the list of employees from the backend
  
  this.employeeService.getEmployees().subscribe(
    (response) => {
      this.employees = response;
    },
    (error) => {
      console.error("Error fetching employees:", error);
    }
  );
}

/**
 * editEmployee
 */
public editEmployee(id: number) {
  // Logic to edit the employee with the given ID
  alert("Edit employee with ID: " + id);
  this.route.navigate([`/update/${id}`]);
}

/**
 * deleteEmployee
 */
public deleteEmployee(id: number) {
  // Logic to delete the employee with the given ID
  this.employeeService.deleteEmployee(id).subscribe(
    (response) => {
      console.log("Employee deleted successfully");
      this.getEmployees(); // Refresh the employee list
    },
    (error) => {
      console.error("Error deleting employee:", error);
    }
  );
}

/**
 * viewEmployee
 */
public viewEmployee(id: number) {
  // Logic to view the details of the employee with the given ID
}
}
