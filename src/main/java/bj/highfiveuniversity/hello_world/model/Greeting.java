public class Greeting {
    private final long id; 
    private final String content;
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }


    public String getContent() {
        return this.content;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null || getClass() != o.getClass()) return false;
        Greeting obj = (Greeting) o ;
        return content == obj.content;
     };

     @Override
    public int hashCode(){
        return Objects.hash(id, content);
    };

    @Override
    public String toString(){
        return "{ id= "+id+ "content="+content+ "}"
    };










}

