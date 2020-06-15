package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.RedisConfig;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 修改配置参数请求体
 */
public class ModifyRedisConfigBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redis_config")
    
    private List<RedisConfig> redisConfig = null;
    
    public ModifyRedisConfigBody withRedisConfig(List<RedisConfig> redisConfig) {
        this.redisConfig = redisConfig;
        return this;
    }

    
    public ModifyRedisConfigBody addRedisConfigItem(RedisConfig redisConfigItem) {
        if (this.redisConfig == null) {
            this.redisConfig = new ArrayList<>();
        }
        this.redisConfig.add(redisConfigItem);
        return this;
    }

    public ModifyRedisConfigBody withRedisConfig(Consumer<List<RedisConfig>> redisConfigSetter) {
        if(this.redisConfig == null ){
            this.redisConfig = new ArrayList<>();
        }
        redisConfigSetter.accept(this.redisConfig);
        return this;
    }

    /**
     * 实例配置项数组。
     * @return redisConfig
     */
    public List<RedisConfig> getRedisConfig() {
        return redisConfig;
    }

    public void setRedisConfig(List<RedisConfig> redisConfig) {
        this.redisConfig = redisConfig;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyRedisConfigBody modifyRedisConfigBody = (ModifyRedisConfigBody) o;
        return Objects.equals(this.redisConfig, modifyRedisConfigBody.redisConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(redisConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyRedisConfigBody {\n");
            sb.append("    redisConfig: ").append(toIndentedString(redisConfig)).append("\n");
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

