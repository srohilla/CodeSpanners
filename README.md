# Project Team : CodeSpanners
This repository is for CMPE202 Project under Prof. Paul Nguyen. 

# Game Name : Age of Spartans
A game designed with a intent of making the process of learning Computer Science concepts fun.

## Concept to be taught  
A minimum spanning tree (MST) or minimum weight spanning tree is a subset of the edges of a connected, edge-weighted undirected graph that connects all the vertices together, without any cycles and with the minimum possible total edge weight. That is, it is a spanning tree whose sum of edge weights is as small as possible  

## Design
The Design of our game:

1. A Galaxy of Planets is shown which represents an edge-weighted undirected graph  
2. A Home planet is the starting point / root node of the graph.
3. An alien represents the validity of a connected neighbour.
4. Asteroids will represent the weight of the edge between two planets. 
5. Rocket will represent that the planet has been traversed.


## Running the game  

* Start the greenfoot client and click on run. 
* The game requires that a server to be running as the score will posted and the ranking will fetched. 

## Docker
Use the script `./docker.sh` to make use of docker commands.
Accounts required:
* AWS Account  
* Docker Hub account  
* Docker Cloud account  
* Docker toolbox  

##Steps followed to dockerize the server:

1. Make an image of the local server using docker build command. 
2. Spun a docker container and test the server on local using docker run command.
2. Push the image on docker hub.  
3. Spun a container on docker cloud using the infrastructure provided by aws and image of game server present on docker hub.  



