#!/usr/bin/env bash

echo "Starting..."
while :
do
	java -jar dockerjob.jar
	echo "Sleeping..."
	sleep 1m
done
