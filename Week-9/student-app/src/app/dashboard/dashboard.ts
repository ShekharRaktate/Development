import { Component } from '@angular/core';
import { UserService } from '../user-service';
import { ActivatedRoute, Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-dashboard',
  imports: [CommonModule],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css',
})
export class Dashboard {
  constructor (private service:UserService,private router:Router,private activeRouter:ActivatedRoute){}
  students:any[]=[];
  public ngOnInit(){ this.getStudents();}
  public getStudents(){
    this.service.getStudents().subscribe({next: (response)=>{console.log();this.students=response},
    error:(error)=>{console.log("Getting error when fetch recordes",error);},
    complete:()=>{console.log("request completed"); }});
  }
  public editStudent(id:number){
    alert("edit studnet with id: "+id);
    this.router.navigate([`/update/${id}`]);
  }
  public deleteStudents(id: number) {
    this.service.getStudents().subscribe({
    next: (response: any) => {
      this.students = response.data;
    },
    error: (error: any) => {
      console.log(error);
    },
    complete: () => {
      console.log("Request completed");
    }
    });
  }
}


