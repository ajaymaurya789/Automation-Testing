Feature: Search

  @search
  Scenario: Verify the functionality of search prodcuts
    Given User should be landed on flipkart site
    When enter "Mobile" in search tab.
    Then Validate search by title of the page

  @multisearch
  Scenario Outline: Verify the search function with multiple data
    Given User should be landed on flipkart site
    When enter "<Product_search>" in search tab.
    Then Validate search by "<Expected_title>" of the page

    Examples: 
      | Product_search | Expected_title |
      | laptop         | Laptop         |
      | mobile         | Mobile         |
      | smart watch    | Smart Watch    |

  @myntrasearch
  Scenario Outline: Verify the search function with multiple data
    Given User should be landed on myntra site
    When enter "<Product_search>" in search tab.
    Then Validate search by "<Expected_title>" of the page

    Examples: 
      | Product_search | Expected_title |
      | wallet         | Wallet         |
      | tshirt         | Tshirt         |
      | perfumes       | Perfume        |
