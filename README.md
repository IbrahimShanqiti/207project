# AtlasAdventures by Pumpkin Patch

We are Pumpkin Patch, a software development group from the Fall 2023 class of CSC207. We have decided to create a fun and engaging geography trivia game in Java this semester, and will be using online API calls to retrieve randomly chosen geographic data about countries all over the world, and will use that data to quiz the user and then display their score on a final scoreboard.

# Problem Domain & App Description
We want to make a geography trivia game that features all types of questions, both textual and visual, with multiple choice answers, map-based answers, and more. We plan to use an API that will give us longitude-langitude, capital cities, populations, and all sorts of statistics so that the user can play many times over without facing the same randomly generated questions so that the game can remain unsaturated and fun throughout. 

# Current API and Examples of Calling It
The API we're currently looking at is [GeoDB Cities API](http://geodb-cities-api.wirefreethought.com/) since it is a free, reliable API that gives us all sorts of data that we can use in our game. Another API we're looking at is the [CountryStateCity API](https://countrystatecity.in/), although in order to use it, we have to submit a request for an APIKey, which is still under consideration.

Here is a screenshot of the GeoDB Cities API being used in [HoppScotch](https://hoppscotch.io/).

![Api Call in HoppScotch](ApiCall.png)

# Java Code Example

Here's an example of calling the API in Java:
![Java API Call](JavaApiCall.png)

