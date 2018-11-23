# PaytmLabs SDE Challenge

## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

### Minimum Requirements

1. Provide a separate interface (IE `interface`/`trait`) with documentation for the data structure
2. Provide an implementation for the interface
3. Provide any additional explanation about the interface and implementation in a README file.

## Design Question

Design A Google Analytic like Backend System.
We need to provide Google Analytic like services to our customers. Please provide a high level solution design for the backend system. Feel free to choose any open source tools as you want.

### Requirements

1. Handle large write volume: Billions of write events per day.
2. Handle large read/query volume: Millions of merchants wish to gain insight into their business. Read/Query patterns are time-series related metrics.
3. Provide metrics to customers with at most one hour delay.
4. Run with minimum downtime.
5. Have the ability to reprocess historical data in case of bugs in the processing logic.



We need to store: IP (15 chars), geographical location (eg. 35.96689,-95.929945: 22 chars), duration (YYYYMMDD hh:mm:ss - start & end: 32 chars), URL (100 chars), userID (32 chars) - total ~ 200 chars
Assume 10 billion write events per day.
200 & 10 bil = 2 trillion ~ 4 terabytes if assuming 2 bytes (16 bits) per char (no compression) per day
Hard-drives - usd SSD to provide better parameters than disks.

Relational DB - Postgres. Regularly index tables for faster write/retrieval. Shard DB to spread data across different machines to help writing data. 
Caching solution - use memcached. Saves lot of reads directly from DB. Faster & efficient way to provide metrics to customers - even real-time.
Load-balancing - PgBouncer. 
Reshard - could take down the server (using repmgr takes ~30 seconds of downtime)



relational DB - Postgres
big data platform - Hadoop with Mahout machine learning library
data format - binary format (GRID/NetCDF/HDF)
search platform - Solr: distributed and real-time indexing, load-balanced querying, automated failover and recovery, centralized configuration, dynamic clustering
storage - NAS: independent scaling of compute and storage resources.