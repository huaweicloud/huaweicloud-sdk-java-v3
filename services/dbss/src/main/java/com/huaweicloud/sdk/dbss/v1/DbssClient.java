package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dbss.v1.model.*;

public class DbssClient {
    protected HcClient hcClient;

    public DbssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DbssClient> newBuilder() {
        return new ClientBuilder<>(DbssClient::new);
    }


    /**
     * 开启关闭Agent
     * 用于开启和关闭agent的功能，当开启后，开始抓取用户的访问信息。
     *
     * @param SwitchAgentRequest 请求对象
     * @return SwitchAgentResponse
     */
    public SwitchAgentResponse switchAgent(SwitchAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchAgent);
    }

    /**
     * 开启关闭Agent
     * 用于开启和关闭agent的功能，当开启后，开始抓取用户的访问信息。
     *
     * @param SwitchAgentRequest 请求对象
     * @return SyncInvoker<SwitchAgentRequest, SwitchAgentResponse>
     */
    public SyncInvoker<SwitchAgentRequest, SwitchAgentResponse> switchAgentInvoker(SwitchAgentRequest request) {
        return new SyncInvoker<SwitchAgentRequest, SwitchAgentResponse>(request, DbssMeta.switchAgent, hcClient);
    }

    /**
     * 开启关闭风险规则
     * 开启关闭风险规则
     *
     * @param SwitchRiskRuleRequest 请求对象
     * @return SwitchRiskRuleResponse
     */
    public SwitchRiskRuleResponse switchRiskRule(SwitchRiskRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchRiskRule);
    }

    /**
     * 开启关闭风险规则
     * 开启关闭风险规则
     *
     * @param SwitchRiskRuleRequest 请求对象
     * @return SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>
     */
    public SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRuleInvoker(SwitchRiskRuleRequest request) {
        return new SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>(request, DbssMeta.switchRiskRule, hcClient);
    }

}