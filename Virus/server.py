import socket
import os
import ipaddress

class server():

    if __name__ == "__main__":
        HOST = '0.0.0.0'
        PORT = 9999

        server = socket.socket()
        server.bind((HOST, PORT))

        server.listen()

        client, address = server.accept()

        while True:

            print(f"Connected to {address}")
            cmd_input = input("Enter a command: ")
            client.send(cmd_input.encode('utf-8'))
            print(client.recv(1024).decode('utf-8'))