package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateValueListRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="valuelistid")
    
    private String valuelistid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateValueListRequestBody body;

    public UpdateValueListRequest withValuelistid(String valuelistid) {
        this.valuelistid = valuelistid;
        return this;
    }

    


    /**
     * 引用表id
     * @return valuelistid
     */
    public String getValuelistid() {
        return valuelistid;
    }

    public void setValuelistid(String valuelistid) {
        this.valuelistid = valuelistid;
    }

    

    public UpdateValueListRequest withBody(UpdateValueListRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateValueListRequest withBody(Consumer<UpdateValueListRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateValueListRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateValueListRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateValueListRequestBody body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateValueListRequest updateValueListRequest = (UpdateValueListRequest) o;
        return Objects.equals(this.valuelistid, updateValueListRequest.valuelistid) &&
            Objects.equals(this.body, updateValueListRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(valuelistid, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateValueListRequest {\n");
        sb.append("    valuelistid: ").append(toIndentedString(valuelistid)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

