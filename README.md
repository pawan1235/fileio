# fileio

|Task|Elapsed Time|
-----|-----------|
Copy file one byte at a time|7.286596 sec
Copy file 1 kilobyte at a time|0.071488 sec
Copy file 4 kilobytes at a time|0.058550 sec
Copy file 64 kilobytes at a time|0.056424 sec
Copy file 1 line at a time|0.128309 sec

#Why Copy a file by using one byte slowest ?
Becasue the task copy-byte-by-byte is copy 1 byte of file at a time so it take the longest time to copy and write a file. But in the task
copy file 1 KB,4 KB,64 KB is faster becasue amount of byte that can copy at a time is a lot more than 1 byte at a time. It should be a lot faster like 1KB is a lot faster than 1 byte at a time and 4 KB at a time is faster than 1 KB at a time and 64 KB at a time is faster than 4KB at a time.

