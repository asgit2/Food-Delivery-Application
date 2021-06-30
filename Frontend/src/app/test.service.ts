import { HttpClient } from '@angular/common/http';
import { Injectable, Input } from '@angular/core';
import { Customer } from 'src/customer';
import { Reserve } from 'src/reserve';
import { Menu } from '../menu';
import { Restaurant } from 'src/restaurant';
import { Cart } from 'src/cart';
import { Feedback } from 'src/feedback';

@Injectable({
  providedIn: 'root'
})
export class TestService {
  
  
  responseData! :any;
  constructor(private httpClient : HttpClient) { }

  getCount(): any {
    let restUrl ="http://localhost:8082/menu/count";
    let response = this.httpClient.get(restUrl);
    return response;
  }
  getMenuData() :any{
    let restUrl ="http://localhost:8082/menu/all";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  getNonVegItems(): any{
    let restUrl ="http://localhost:8082/menu/category/Non-veg";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  getVegItems(): any{
    let restUrl ="http://localhost:8082/menu/category/veg";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  getChineseItems(): any{
    let restUrl ="http://localhost:8082/menu/category/chinese";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  getDrinksItems(): any{
    let restUrl ="http://localhost:8082/menu/category/drinks";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  getMenuByRestaurant() : any{
    let restUrl ="http://localhost:8082/menu/restaurant/6";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  addNewMenu(menu : Menu) : any{
    return this.httpClient.post<Menu>("http://localhost:8082/menu/add",menu);
  }
  deleteMenu(menuId: number) {
    this.httpClient.delete("http://localhost:8082/menu/" + menuId).subscribe(
      (responseData)=> {
        this.responseData = responseData;
        console.log(responseData);}
        );
  }
  FeatchAllRestauarnts() : any{
    let restUrl = "http://localhost:8083/restaurant/all";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }

  addNewRestaurant(restaurant : Restaurant) : any{
    return this.httpClient.post<Restaurant>("http://localhost:8083/restaurant/add" ,restaurant)
    .subscribe((responseData)=> {
      this.responseData = this.responseData;
      console.log(responseData);
    });
  }
  // @Input() cityname !: String ;
  // serachByCityName(cityname : string): any{
  //   let restUrl = "http://localhost:8083/restaurant/city/" +cityname;
  //   let response = this.httpClient.get(restUrl);
  //   response.subscribe((responseData) => console.log(responseData));
  //   return response;
  // }
  bookATable(reserve : Reserve) :any{
    let restUrl ="http://localhost:8090/reservetable/add";
    return this.httpClient.post<Reserve>(restUrl ,reserve)
    .subscribe((responseData)=> {
      this.responseData = this.responseData;
      console.log(responseData);
      alert(`
      Your Request for reserve a table to send to respective restaurant
      You will receive a conformation shortly`);
    });
  }
  addCredential(credential: Credential) : any{
    let restUrl ="http://localhost:8086/credentials/add";
    return this.httpClient.post<Credential>(restUrl,credential)
    .subscribe((responseData)=>{
      this.responseData =this.responseData;
      console.log(responseData);
    });
  }
  addNewCustomer(customer : Customer): any{
    let restUrl ="http://localhost:8084/customer/add";
    return this.httpClient.post<Credential>(restUrl,customer)
    .subscribe((responseData)=>{
      this.responseData =this.responseData;
      console.log(responseData);
    });
  }
  // Cart data
  getAllCart(): any{
    let restUrl = "http://localhost:8091/cart/all";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  
  addtoCart(thecart : Cart) : any{
    // thecart : any = new Cart(name,price);
    let restUrl = "http://localhost:8091/cart/add";
    return this.httpClient.post<Credential>(restUrl,thecart)
    .subscribe((responseData)=>{
      this.responseData =this.responseData;
      console.log(responseData);
    });
  }
  
  addAfeedback(feedback : Feedback) : any{
    return this.httpClient.post<Feedback>("http://localhost:8088/feedback/add" ,feedback)
    .subscribe((responseData)=> {
      this.responseData = this.responseData;
      console.log(responseData);
      alert("Thank You for your feedback!")
    });
  }
}



