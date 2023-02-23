package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.TimeRangeBean;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OperateLogGetRequest
 */
public class OperateLogGetRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    

    private TimeRangeBean time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operate_name")
    

    private String operateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    

    private String page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    

    private String size;

    public OperateLogGetRequest withTime(TimeRangeBean time) {
        this.time = time;
        return this;
    }

    public OperateLogGetRequest withTime(Consumer<TimeRangeBean> timeSetter) {
        if(this.time == null ){
            this.time = new TimeRangeBean();
            timeSetter.accept(this.time);
        }
        
        return this;
    }


    /**
     * Get time
     * @return time
     */
    public TimeRangeBean getTime() {
        return time;
    }

    public void setTime(TimeRangeBean time) {
        this.time = time;
    }

    

    public OperateLogGetRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 筛选角色用户获取操作日志
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public OperateLogGetRequest withOperateName(String operateName) {
        this.operateName = operateName;
        return this;
    }

    


    /**
     * 筛选操作对象名称获取操作日志
     * @return operateName
     */
    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    

    public OperateLogGetRequest withResult(String result) {
        this.result = result;
        return this;
    }

    


    /**
     * 根据执行结果获取操作日志 [success, fail]
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    

    public OperateLogGetRequest withPage(String page) {
        this.page = page;
        return this;
    }

    


    /**
     * 页数
     * @return page
     */
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    

    public OperateLogGetRequest withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 每页条数
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateLogGetRequest operateLogGetRequest = (OperateLogGetRequest) o;
        return Objects.equals(this.time, operateLogGetRequest.time) &&
            Objects.equals(this.userName, operateLogGetRequest.userName) &&
            Objects.equals(this.operateName, operateLogGetRequest.operateName) &&
            Objects.equals(this.result, operateLogGetRequest.result) &&
            Objects.equals(this.page, operateLogGetRequest.page) &&
            Objects.equals(this.size, operateLogGetRequest.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(time, userName, operateName, result, page, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateLogGetRequest {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    operateName: ").append(toIndentedString(operateName)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

