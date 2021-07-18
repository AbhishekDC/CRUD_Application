import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from '../ngservice.service';
import { Product } from '../product';
@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {
  deleteStatus:any
  productList=[]
  constructor(private _service:NgserviceService,private _router:Router) {  }

  ngOnInit(): void {

        this._service.fetchProductListFromRemote().subscribe(
          data=>{console.log("Response received")
                this.productList=data
        },
          error=>console.log("Exception Occured Check Again")
        )
  }
  goToAddProduct(){
    this._router.navigate(['/addproduct'])
  }

  deleteProduct(id:number){
    this._service.deleteProduct(id).subscribe(
      data=>{this.deleteStatus=data
        console.log("Deleted")
        
      },
      error=>{console.log("Error Occured")
              this.deleteStatus=error}
    )
    window.location.reload();
  }

}
