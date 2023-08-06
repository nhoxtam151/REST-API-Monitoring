# Monitoring REST API Performance with Prometheus, Grafana, and Apache Bench

## Description

This project demonstrates how to set up monitoring for a REST API using Prometheus, Grafana, and Apache Bench. Prometheus is used for collecting metrics from the API, Grafana for visualizing the metrics in customizable dashboards, and Apache Bench for load testing the API and generating performance metrics.

## Prerequisites

-Promotheus, Grafana and Apache bench installed on your system.

# Components

## Prometheus
Prometheus is a monitoring and alerting toolkit designed for reliability and scalability. It scrapes metrics from configured targets, stores the data, and allows you to query and visualize it using PromQL (Prometheus Query Language).

## Grafana
Grafana is an open-source analytics and monitoring platform that integrates with various data sources, including Prometheus. It provides a feature-rich dashboard editor to create and customize visualizations of collected metrics.

## Apache Bench
Apache Bench (ab) is a command-line load testing tool that measures the performance of web servers. It can be used to simulate multiple concurrent users accessing the API and generate performance statistics.

## Customizing Grafana Dashboard
The default Grafana dashboard provided in this repository is a starting point. You can customize it to suit your specific monitoring needs. Feel free to add more panels, change visualization types, or apply additional metrics based on your API's requirements.
