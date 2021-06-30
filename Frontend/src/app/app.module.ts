import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { FormsModule } from '@angular/forms';
import { MenuDisplayComponent } from './menu-display/menu-display.component';
import { AddMenuComponent } from './add-menu/add-menu.component';
import { RestaurantdetailsComponent } from './restaurantdetails/restaurantdetails.component';
import { AccountComponent } from './account/account.component';
import { CustomerFormComponent } from './customer-form/customer-form.component';
import { RestaurantFormComponent } from './restaurant-form/restaurant-form.component';
import { MenuFormComponent } from './menu-form/menu-form.component';
import { BookATableComponent } from './book-atable/book-atable.component';
import { LoginComponent } from './login/login.component';
import { CatalogComponent } from './catalog/catalog.component';
import { MenuByCategoryComponent } from './menu-by-category/menu-by-category.component';
import { GetVegItemsComponent } from './get-veg-items/get-veg-items.component';
import { GetChineseComponent } from './get-chinese/get-chinese.component';
import { GetDrinksComponent } from './get-drinks/get-drinks.component';
import { CartComponent } from './cart/cart.component';
import { PaymentgatewayComponent } from './paymentgateway/paymentgateway.component';
import { FeedbackFormComponent } from './feedback-form/feedback-form.component';
import { GetMenuByRestaurantComponent } from './get-menu-by-restaurant/get-menu-by-restaurant.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MenuDisplayComponent,
    AddMenuComponent,
    RestaurantdetailsComponent,
    AccountComponent,
    CustomerFormComponent,
    RestaurantFormComponent,
    MenuFormComponent,
    BookATableComponent,
    LoginComponent,
    CatalogComponent,
    MenuByCategoryComponent,
    GetVegItemsComponent,
    GetChineseComponent,
    GetDrinksComponent,
    CartComponent,
    PaymentgatewayComponent,
    FeedbackFormComponent,
    GetMenuByRestaurantComponent,
    AdminDashboardComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
