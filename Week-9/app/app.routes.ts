import { Routes } from '@angular/router';
import { AddEmployee } from './add-employee/add-employee';
import { Dashboard } from './dashboard/dashboard';
import { UpdateEmployee } from './update-employee/update-employee';
import { DeleteEmployee } from './delete-employee/delete-employee';

export const routes: Routes = [
    { path: 'add',component:AddEmployee} ,
    { path: 'update/:id',component:UpdateEmployee} ,
    
    {path:'',component:Dashboard}   
];
