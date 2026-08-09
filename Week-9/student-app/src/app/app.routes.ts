import { Routes } from '@angular/router';
import { register } from 'node:module';
import { Register } from './register/register';
import { Dashboard } from './dashboard/dashboard';
import { UpdateStudent } from './update-student/update-student';
import { Login } from './login/login';

export const routes: Routes = [
    {path:'register',component:Register},
    {path:'',component:Login},
    {path:'update/:id',component:UpdateStudent},
    {path:'dashboard',component:Dashboard}
];
