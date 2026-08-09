import { Component } from '@angular/core';
import { UserService } from '../user-service';
import { ActivatedRoute, Router } from '@angular/router';
import { response } from 'express';
import { error } from 'node:console';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-update-student',
  imports: [CommonModule,FormsModule],
  templateUrl: './update-student.html',
  styleUrl: './update-student.css',
})
export class UpdateStudent {
  studentResp:any;
  id:any;
  constructor(private service:UserService,private route:Router,private activeRoute:ActivatedRoute){}
  public ngOnInit(){
    this.service.getStudent(this.activeRoute.snapshot.params['id']).subscribe({
      next:(response)=>{alert("Data is Updated Successfully")
      this.route.navigate(['/'])},
      error:(error)=>{console.log(error);},
      complete:()=>{
        console.log("Update request completed");
      }
    });
  }
 
  public updateStudent(studentResp:any){
  this.service.updateStudent(this.id, this.studentResp).subscribe({
    next: (response: any) => {
      alert("Data Updated Successfully");
      this.route.navigate(['/']);
    },
    error: (error: any) => {
      console.log(error);
    },
    complete: () => {
      console.log("Update request completed");
    }
  });
}

}
