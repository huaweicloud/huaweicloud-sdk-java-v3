package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreatePoolRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool")
    
    private CreatePoolOption pool = null;

    public CreatePoolRequestBody withPool(CreatePoolOption pool) {
        this.pool = pool;
        return this;
    }

    public CreatePoolRequestBody withPool(Consumer<CreatePoolOption> poolSetter) {
        if(this.pool == null ){
            this.pool = new CreatePoolOption();
            poolSetter.accept(this.pool);
        }
        
        return this;
    }


    /**
     * Get pool
     * @return pool
     */
    public CreatePoolOption getPool() {
        return pool;
    }

    public void setPool(CreatePoolOption pool) {
        this.pool = pool;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePoolRequestBody createPoolRequestBody = (CreatePoolRequestBody) o;
        return Objects.equals(this.pool, createPoolRequestBody.pool);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pool);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolRequestBody {\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

