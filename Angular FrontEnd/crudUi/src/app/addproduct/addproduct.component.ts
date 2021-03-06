import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { NgserviceService } from '../ngservice.service';
import { Product } from '../product';
@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
  product= new Product()
  constructor(private _router:Router,private service:NgserviceService) { }

  ngOnInit(): void {
  }

  addProduct(){
    
    this.service.addProduct(this.product).subscribe(
      data=> {
        console.log("Data Added Successfully")
        this._router.navigate(['/productlist'])
      },
      error=>console.log("Error")
    )
  }

  gotolist(){
    this._router.navigate(['/productlist'])
  }

}
