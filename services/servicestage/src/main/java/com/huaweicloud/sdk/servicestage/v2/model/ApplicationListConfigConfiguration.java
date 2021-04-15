package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ApplicationListConfigConfigurationEnv;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用配置信息。
 */
public class ApplicationListConfigConfiguration  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env")
    
    private List<ApplicationListConfigConfigurationEnv> env = null;
    
    public ApplicationListConfigConfiguration withEnv(List<ApplicationListConfigConfigurationEnv> env) {
        this.env = env;
        return this;
    }

    
    public ApplicationListConfigConfiguration addEnvItem(ApplicationListConfigConfigurationEnv envItem) {
        if(this.env == null) {
            this.env = new ArrayList<>();
        }
        this.env.add(envItem);
        return this;
    }

    public ApplicationListConfigConfiguration withEnv(Consumer<List<ApplicationListConfigConfigurationEnv>> envSetter) {
        if(this.env == null) {
            this.env = new ArrayList<>();
        }
        envSetter.accept(this.env);
        return this;
    }

    /**
     * 应用组件环境变量。
     * @return env
     */
    public List<ApplicationListConfigConfigurationEnv> getEnv() {
        return env;
    }

    public void setEnv(List<ApplicationListConfigConfigurationEnv> env) {
        this.env = env;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationListConfigConfiguration applicationListConfigConfiguration = (ApplicationListConfigConfiguration) o;
        return Objects.equals(this.env, applicationListConfigConfiguration.env);
    }
    @Override
    public int hashCode() {
        return Objects.hash(env);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationListConfigConfiguration {\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
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

