@tag
Feature: Order a laptop
  Order a laptop

   
   @blaze
  Scenario Outline: Validate that user is able to add, delete and purchase a product from the DemoBlaze cart
  Given user is on DemoBlaze website Home Page
  When user navigates to Laptop section
  And user adds in the Cart Sony vaio i5
  And user adds in the Cart Dell i7 8gb
  And user navigates to the Cart
  And user deletes Dell i7 8gb from the Cart
  And User Places the Order
  And user fill web form details
  And User carry on Purchase
  Then PurchaseId and Amount appears
  And Validate the "<Amount>"
   

    Examples: 
      | Amount |
      | 790    |