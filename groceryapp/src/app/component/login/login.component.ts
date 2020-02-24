import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup,Validator, Validators, RequiredValidator}from '@angular/forms';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public userform:FormGroup;


  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
    this.createForm()
  }
createForm(){
  this.userform = this.fb.group({
    'email':[null,Validators.required] ,
    'password':[null,Validators.required]

  })
}
onsubmit(data){
  console.log(data)
}
}
