package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dbss.v1.model.*;

public class DbssAsyncClient {
    protected HcClient hcClient;

    public DbssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DbssAsyncClient> newBuilder() {
        return new ClientBuilder<>(DbssAsyncClient::new);
    }


    /**
     * 开启关闭Agent
     * 用于开启和关闭agent的功能，当开启后，开始抓取用户的访问信息。
     *
     * @param SwitchAgentRequest 请求对象
     * @return CompletableFuture<SwitchAgentResponse>
     */
    public CompletableFuture<SwitchAgentResponse> switchAgentAsync(SwitchAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchAgent);
    }

    /**
     * 开启关闭Agent
     * 用于开启和关闭agent的功能，当开启后，开始抓取用户的访问信息。
     *
     * @param SwitchAgentRequest 请求对象
     * @return AsyncInvoker<SwitchAgentRequest, SwitchAgentResponse>
     */
    public AsyncInvoker<SwitchAgentRequest, SwitchAgentResponse> switchAgentAsyncInvoker(SwitchAgentRequest request) {
        return new AsyncInvoker<SwitchAgentRequest, SwitchAgentResponse>(request, DbssMeta.switchAgent, hcClient);
    }

    /**
     * 开启关闭风险规则
     * 开启关闭风险规则
     *
     * @param SwitchRiskRuleRequest 请求对象
     * @return CompletableFuture<SwitchRiskRuleResponse>
     */
    public CompletableFuture<SwitchRiskRuleResponse> switchRiskRuleAsync(SwitchRiskRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchRiskRule);
    }

    /**
     * 开启关闭风险规则
     * 开启关闭风险规则
     *
     * @param SwitchRiskRuleRequest 请求对象
     * @return AsyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>
     */
    public AsyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRuleAsyncInvoker(SwitchRiskRuleRequest request) {
        return new AsyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>(request, DbssMeta.switchRiskRule, hcClient);
    }

}