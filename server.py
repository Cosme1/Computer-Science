import socket
import os
import ipaddress

PORT = 9090

server = socket.socket()
server.bind(('127.0.0.1', PORT))

server.listen()

client, address = server.accept()

while True:

    print(f"Connected to {address}")
    cmd_input = input("Enter a command: ")
    client.send(cmd_input.encode('utf-8'))
    print(client.recv(1024).decode('utf-8'))