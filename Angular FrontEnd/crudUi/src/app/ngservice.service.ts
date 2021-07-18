import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';
@Injectable({
  providedIn: 'root'
})
export class NgserviceService {
  deleteStatus:any
  a:String
  constructor(private _http:HttpClient) {}

    fetchProductListFromRemote():Observable<any>{
      return this._http.get<any>("http://localhost:8080/getproductlist")
    }

    addProduct(product:Product):Observable<any>{
      return this._http.post<any>("http://localhost:8080/addproduct",product)
    }
    
    deleteProduct(id:number):Observable<any>{
      return this._http.delete<any>("http://localhost:8080//deleteproductbyid/"+id)
    }
}
