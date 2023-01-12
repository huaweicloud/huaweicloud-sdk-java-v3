package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RegisterScenesReqScenes
 */
public class RegisterScenesReqScenes  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="applications")
    
    
    private List<String> applications = null;
    
    public RegisterScenesReqScenes withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 场景名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public RegisterScenesReqScenes withApplications(List<String> applications) {
        this.applications = applications;
        return this;
    }

    
    public RegisterScenesReqScenes addApplicationsItem(String applicationsItem) {
        if(this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public RegisterScenesReqScenes withApplications(Consumer<List<String>> applicationsSetter) {
        if(this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /**
     * 要订阅的application名字列表(当前不支持)。
     * @return applications
     */
    public List<String> getApplications() {
        return applications;
    }

    public void setApplications(List<String> applications) {
        this.applications = applications;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterScenesReqScenes registerScenesReqScenes = (RegisterScenesReqScenes) o;
        return Objects.equals(this.name, registerScenesReqScenes.name) &&
            Objects.equals(this.applications, registerScenesReqScenes.applications);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, applications);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterScenesReqScenes {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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

