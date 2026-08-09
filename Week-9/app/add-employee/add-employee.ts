import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { EmployeeService } from '../service/employee-service';
import { provideHttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-employee',
  imports: [CommonModule,FormsModule],
   templateUrl: './add-employee.html',
  styleUrl: './add-employee.css',
})
export class AddEmployee {
/**
 * addEmployee
 */
constructor(private employeeService: EmployeeService, private route:Router) {
  // Initialize any necessary properties here
}
public addEmployee(employee: any) {
  console.log("Adding employee:");
  console.log("Employee added:", employee.value);
  this.employeeService.addEmployee(employee.value).subscribe( 
    (response) => {
      alert("Employee added successfully");
      this.route.navigate(['/']);

    },
    (error) => {
      console.error("Error adding employee:", error);
    }
  );
}
}
