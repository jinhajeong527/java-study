package nested.example;

public class Chatting {
    public static void main(String[] args) {
        Chatting chatting = new Chatting();
        chatting.startChat("jinha");
    }
    void startChat(String chatId) {
        String nickName = chatId;

        class Chat {
            public void start() {
                while(true) {
                    String inputData = "안녕하세요";
                    String message = "["+nickName+"]"+ inputData;
                    sendMessage(message);
                    if(nickName.equals("jinha")) {
                        break;
                    }
                }
            }
            void sendMessage(String message) {
                System.out.println(message);
            }
        }
        Chat chat = new Chat();
        chat.start();
    }
}
