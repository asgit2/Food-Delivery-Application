import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetChineseComponent } from './get-chinese.component';

describe('GetChineseComponent', () => {
  let component: GetChineseComponent;
  let fixture: ComponentFixture<GetChineseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetChineseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetChineseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
