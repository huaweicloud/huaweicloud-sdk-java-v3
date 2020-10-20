package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.UpdatePoolV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdatePoolRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool")
    
    private UpdatePoolV2Req pool = null;

    public UpdatePoolRequestBody withPool(UpdatePoolV2Req pool) {
        this.pool = pool;
        return this;
    }

    public UpdatePoolRequestBody withPool(Consumer<UpdatePoolV2Req> poolSetter) {
        if(this.pool == null ){
            this.pool = new UpdatePoolV2Req();
            poolSetter.accept(this.pool);
        }
        
        return this;
    }


    /**
     * Get pool
     * @return pool
     */
    public UpdatePoolV2Req getPool() {
        return pool;
    }

    public void setPool(UpdatePoolV2Req pool) {
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
        UpdatePoolRequestBody updatePoolRequestBody = (UpdatePoolRequestBody) o;
        return Objects.equals(this.pool, updatePoolRequestBody.pool);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pool);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePoolRequestBody {\n");
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

