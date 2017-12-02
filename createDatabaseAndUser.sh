#!/usr/bin/env bash
set -e

psql -U postgres -c "CREATE ROLE flywayexample LOGIN  PASSWORD 'flywayexample'"
psql -U postgres -d postgres -c "CREATE DATABASE flywayexample OWNER flywayexample"
