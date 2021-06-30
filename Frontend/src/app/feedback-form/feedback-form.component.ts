import { Component, OnInit } from '@angular/core';
import { Feedback } from 'src/feedback';
import { TestService } from '../test.service';

@Component({
  selector: 'app-feedback-form',
  templateUrl: './feedback-form.component.html',
  styleUrls: ['./feedback-form.component.css']
})
export class FeedbackFormComponent implements OnInit {

  theFeedback : any= new Feedback();
  constructor(private service : TestService) { }

  ngOnInit(): void {
  }
  addAFeedback(){
    return this.service.addAfeedback(this.theFeedback).subscribe(() => {
      alert("Thank You for your feedback")});
  }

}
