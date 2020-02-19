import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  public catId;
  public subCategory: any;
  public products: any;
  public _image_url =  'http://rjtmobile.com/grocery/images/';

  constructor(private dataService: DataService,private route:ActivatedRoute) { 
    this.catId=route.snapshot.paramMap.get('id');
  }

  ngOnInit(): void {
      this.dataService.getProducts(1).subscribe(
      x => this.products = x.data
    )
    this.dataService.getProducts(1).subscribe(
      x => this.products = x.data
    )
  }onSelectSubCatagory(subId){
    console.log(subId)
    this.dataService.getProducts(subId).subscribe(
      x=>this.products=x.data

    )

    
  }
  addToCart(product){
  if(localStorage.cart == undefined){
    console.log(products)
    var cartItems=[];
    localStorage.cart = JSON.stringify(cartItems)
  }else{
    var products = JSON.parse(localStorage.cart);
    products.push(product)
    localStorage.cart = JSON.stringify(products)
  }


  }
}