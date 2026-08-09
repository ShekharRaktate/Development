import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { EmployeeService } from '../service/employee-service';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-employee',
  imports: [FormsModule,CommonModule],
  templateUrl: './update-employee.html',
  styleUrl: './update-employee.css',
})
export class UpdateEmployee {
  userResp : any;
  id: any;
  constructor(private userService:EmployeeService,private route:Router,private router:ActivatedRoute ) {}
ngOnInit(){
this.userService.getEmployee(this.router.snapshot.params[`id`]).subscribe(resp=>{
  console.log(resp);
  this.userResp=resp;
  this.id=this.router.snapshot.params[`id`];
},
(err)=>{
  console.log(err);
})
  }
  updateEmployee(updateData:any){
    this.userService.updateEmployee(this.id, updateData).subscribe(resp=>{
      console.log("Employee updated successfully",updateData.value);
      this.route.navigate(['/']);
    },
    (err)=>{
      console.log(err);
    })
  }
}


