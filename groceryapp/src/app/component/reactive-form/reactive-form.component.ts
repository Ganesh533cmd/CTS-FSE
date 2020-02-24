import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
 /**  userForm=new FormGroup({
    name:new FormControl(),
    email:new FormControl(),
    address: new FormGroup({
    house:new FormControl(),
    city:new FormControl(),
    country:new FormControl()    })*/

localData(){
  this.userForm.patchValue({
    name:'gani',
    Email:'gani@email.com',
    /**address:{
    house:'house1',
    city:'city 1',
    country:'country 1'*/
    
    
  })
}

  constructor(private fb: FormBuilder) {}
  userForm=this.fb.group({
  name:[null, [Validators.required,Validators.minLength(3), Validators.maxLength(10)]],
  email:[null,Validators.required]

})
  
  ngOnInit(): void {
  }
onSubmit(Data){
  console.log(Data)
}
}
