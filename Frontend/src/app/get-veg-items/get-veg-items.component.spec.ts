import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetVegItemsComponent } from './get-veg-items.component';

describe('GetVegItemsComponent', () => {
  let component: GetVegItemsComponent;
  let fixture: ComponentFixture<GetVegItemsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetVegItemsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetVegItemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
