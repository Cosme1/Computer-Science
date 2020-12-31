import socket
import os
import ipaddress

devices = []
for device in os.popen('arp -a'): 
    devices.append(device)
    print(device)
hostName = input('Enter the host to be scanned: ')

HOST = '192.168.2.159' ##socket.gethostbyname(hostName) #IP Adress
print(HOST)
PORT = 9090

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((HOST, PORT))

server.listen()

client, address = server.accept()

while True:

    print(f"Connected to {address}")
    cmd_input = input("Enter a command: ")
    client.send(cmd_input.encode('utf-8'))
    print(client.recv(1024).decode('utf-8'))