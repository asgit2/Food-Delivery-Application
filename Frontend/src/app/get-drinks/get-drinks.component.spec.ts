import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetDrinksComponent } from './get-drinks.component';

describe('GetDrinksComponent', () => {
  let component: GetDrinksComponent;
  let fixture: ComponentFixture<GetDrinksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetDrinksComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetDrinksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
