NBAZone Backend

NBAZone is a full-stack sports analytics platform designed to explore and analyse NBA player performance data.
This repository contains the backend API built with Spring Boot and PostgreSQL.


Features:
RESTful API for NBA player data
Player search and profile endpoints
Season-level performance statistics
Optimised queries using materialized views
Scalable backend architecture


Tech Stack:
Java 21
Spring Boot
JdbcTemplate
PostgreSQL


Database Design:

Core tables:
players
games
player_game_stats

Materialized view:
mv_player_season_summary (aggregated player stats by season)


API Endpoints:
GET /health/db → Check database connection
GET /players?search= → Search players
GET /players/{id} → Player details
GET /players/{id}/seasons → Player season stats


Running the Project:

Prerequisites:
Java 21
PostgreSQL

Steps:

Clone the repo
git clone https://github.com/quiszioce/NBAZone_Backend.git

Navigate into folder
cd nbazone-backend

Configure database in application.properties

Run the app
./mvnw spring-boot:run


Notes:
Database credentials are not included
Set up your own local PostgreSQL instance


Future Improvements:
Authentication and user accounts
Machine learning features
More endpoints (teams, advanced stats)
Performance improvements

Author:
Alex Esposito