import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { UserService } from '../user-service';
import { response } from 'express';
import { error } from 'console';

@Component({
  selector: 'app-register',
  imports: [CommonModule,FormsModule],
  templateUrl: './register.html',
  styleUrl: './register.css',
})
export class Register {
  constructor(private service:UserService){}
  public addStudent(data:any){
    console.log(data.value)
    this.service.addStudent(data.value).subscribe({next:(response)=>{console.log(response);},
    error: (error)=>{alert("Record not inserted");},
    complete:()=>{
      console.log("request completed");
    }});
    
  }
}
