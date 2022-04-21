package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.lts.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class LtsAsyncClient {

    protected HcClient hcClient;

    public LtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LtsAsyncClient> newBuilder() {
        return new ClientBuilder<>(LtsAsyncClient::new);
    }

    /**
     * 创建日志接入
     *
     * 创建日志接入
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAccessConfigRequest 请求对象
     * @return CompletableFuture<CreateAccessConfigResponse>
     */
    public CompletableFuture<CreateAccessConfigResponse> createAccessConfigAsync(CreateAccessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createAccessConfig);
    }

    /**
     * 创建日志接入
     *
     * 创建日志接入
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAccessConfigRequest 请求对象
     * @return AsyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse>
     */
    public AsyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse> createAccessConfigAsyncInvoker(
        CreateAccessConfigRequest request) {
        return new AsyncInvoker<CreateAccessConfigRequest, CreateAccessConfigResponse>(request,
            LtsMeta.createAccessConfig, hcClient);
    }

    /**
     * 创建主机组
     *
     * 创建主机组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateHostGroupRequest 请求对象
     * @return CompletableFuture<CreateHostGroupResponse>
     */
    public CompletableFuture<CreateHostGroupResponse> createHostGroupAsync(CreateHostGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createHostGroup);
    }

    /**
     * 创建主机组
     *
     * 创建主机组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateHostGroupRequest 请求对象
     * @return AsyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse>
     */
    public AsyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse> createHostGroupAsyncInvoker(
        CreateHostGroupRequest request) {
        return new AsyncInvoker<CreateHostGroupRequest, CreateHostGroupResponse>(request, LtsMeta.createHostGroup,
            hcClient);
    }

    /**
     * 创建关键词告警规则
     *
     * 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateKeywordsAlarmRuleRequest 请求对象
     * @return CompletableFuture<CreateKeywordsAlarmRuleResponse>
     */
    public CompletableFuture<CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRuleAsync(
        CreateKeywordsAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createKeywordsAlarmRule);
    }

    /**
     * 创建关键词告警规则
     *
     * 该接口用于创建关键词告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateKeywordsAlarmRuleRequest 请求对象
     * @return AsyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse>
     */
    public AsyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRuleAsyncInvoker(
        CreateKeywordsAlarmRuleRequest request) {
        return new AsyncInvoker<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse>(request,
            LtsMeta.createKeywordsAlarmRule, hcClient);
    }

    /**
     * 创建日志转储（旧版）
     *
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return CompletableFuture<CreateLogDumpObsResponse>
     */
    public CompletableFuture<CreateLogDumpObsResponse> createLogDumpObsAsync(CreateLogDumpObsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogDumpObs);
    }

    /**
     * 创建日志转储（旧版）
     *
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>
     */
    public AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObsAsyncInvoker(
        CreateLogDumpObsRequest request) {
        return new AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>(request, LtsMeta.createLogDumpObs,
            hcClient);
    }

    /**
     * 创建日志组
     *
     * 该接口用于创建一个日志组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLogGroupRequest 请求对象
     * @return CompletableFuture<CreateLogGroupResponse>
     */
    public CompletableFuture<CreateLogGroupResponse> createLogGroupAsync(CreateLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogGroup);
    }

    /**
     * 创建日志组
     *
     * 该接口用于创建一个日志组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLogGroupRequest 请求对象
     * @return AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>
     */
    public AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroupAsyncInvoker(
        CreateLogGroupRequest request) {
        return new AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>(request, LtsMeta.createLogGroup,
            hcClient);
    }

    /**
     * 创建日志流
     *
     * 该接口用于创建某个指定日志组下的日志流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLogStreamRequest 请求对象
     * @return CompletableFuture<CreateLogStreamResponse>
     */
    public CompletableFuture<CreateLogStreamResponse> createLogStreamAsync(CreateLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogStream);
    }

    /**
     * 创建日志流
     *
     * 该接口用于创建某个指定日志组下的日志流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLogStreamRequest 请求对象
     * @return AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>
     */
    public AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse> createLogStreamAsyncInvoker(
        CreateLogStreamRequest request) {
        return new AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>(request, LtsMeta.createLogStream,
            hcClient);
    }

    /**
     * 创建消息模板
     *
     * 该接口用于创建通知模板，目前每个帐户最多可以创建共100个通知模板，创建后名称不可修改。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateNotificationTemplateRequest 请求对象
     * @return CompletableFuture<CreateNotificationTemplateResponse>
     */
    public CompletableFuture<CreateNotificationTemplateResponse> createNotificationTemplateAsync(
        CreateNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createNotificationTemplate);
    }

    /**
     * 创建消息模板
     *
     * 该接口用于创建通知模板，目前每个帐户最多可以创建共100个通知模板，创建后名称不可修改。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse>
     */
    public AsyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> createNotificationTemplateAsyncInvoker(
        CreateNotificationTemplateRequest request) {
        return new AsyncInvoker<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse>(request,
            LtsMeta.createNotificationTemplate, hcClient);
    }

    /**
     * 通过结构化模板创建结构化配置（新）
     *
     * 该接口通过结构化模板创建结构化配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateStructConfigRequest 请求对象
     * @return CompletableFuture<CreateStructConfigResponse>
     */
    public CompletableFuture<CreateStructConfigResponse> createStructConfigAsync(CreateStructConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createStructConfig);
    }

    /**
     * 通过结构化模板创建结构化配置（新）
     *
     * 该接口通过结构化模板创建结构化配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateStructConfigRequest 请求对象
     * @return AsyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse>
     */
    public AsyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse> createStructConfigAsyncInvoker(
        CreateStructConfigRequest request) {
        return new AsyncInvoker<CreateStructConfigRequest, CreateStructConfigResponse>(request,
            LtsMeta.createStructConfig, hcClient);
    }

    /**
     * 创建结构化配置
     *
     * 该接口用于创建指定日志流下的结构化配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateStructTemplateRequest 请求对象
     * @return CompletableFuture<CreateStructTemplateResponse>
     */
    public CompletableFuture<CreateStructTemplateResponse> createStructTemplateAsync(
        CreateStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createStructTemplate);
    }

    /**
     * 创建结构化配置
     *
     * 该接口用于创建指定日志流下的结构化配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateStructTemplateRequest 请求对象
     * @return AsyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse>
     */
    public AsyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse> createStructTemplateAsyncInvoker(
        CreateStructTemplateRequest request) {
        return new AsyncInvoker<CreateStructTemplateRequest, CreateStructTemplateResponse>(request,
            LtsMeta.createStructTemplate, hcClient);
    }

    /**
     * 创建日志转储（新版）
     *
     * 该接口用于创建OBS转储，DIS转储，DMS转储。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTransferRequest 请求对象
     * @return CompletableFuture<CreateTransferResponse>
     */
    public CompletableFuture<CreateTransferResponse> createTransferAsync(CreateTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createTransfer);
    }

    /**
     * 创建日志转储（新版）
     *
     * 该接口用于创建OBS转储，DIS转储，DMS转储。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTransferRequest 请求对象
     * @return AsyncInvoker<CreateTransferRequest, CreateTransferResponse>
     */
    public AsyncInvoker<CreateTransferRequest, CreateTransferResponse> createTransferAsyncInvoker(
        CreateTransferRequest request) {
        return new AsyncInvoker<CreateTransferRequest, CreateTransferResponse>(request, LtsMeta.createTransfer,
            hcClient);
    }

    /**
     * 删除日志接入
     *
     * 删除日志接入
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAccessConfigRequest 请求对象
     * @return CompletableFuture<DeleteAccessConfigResponse>
     */
    public CompletableFuture<DeleteAccessConfigResponse> deleteAccessConfigAsync(DeleteAccessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteAccessConfig);
    }

    /**
     * 删除日志接入
     *
     * 删除日志接入
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAccessConfigRequest 请求对象
     * @return AsyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse>
     */
    public AsyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse> deleteAccessConfigAsyncInvoker(
        DeleteAccessConfigRequest request) {
        return new AsyncInvoker<DeleteAccessConfigRequest, DeleteAccessConfigResponse>(request,
            LtsMeta.deleteAccessConfig, hcClient);
    }

    /**
     * 删除活动告警
     *
     * 该接口用于删除活动告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteActiveAlarmsRequest 请求对象
     * @return CompletableFuture<DeleteActiveAlarmsResponse>
     */
    public CompletableFuture<DeleteActiveAlarmsResponse> deleteActiveAlarmsAsync(DeleteActiveAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteActiveAlarms);
    }

    /**
     * 删除活动告警
     *
     * 该接口用于删除活动告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteActiveAlarmsRequest 请求对象
     * @return AsyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse>
     */
    public AsyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> deleteActiveAlarmsAsyncInvoker(
        DeleteActiveAlarmsRequest request) {
        return new AsyncInvoker<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse>(request,
            LtsMeta.deleteActiveAlarms, hcClient);
    }

    /**
     * 删除主机组
     *
     * 删除主机组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteHostGroupRequest 请求对象
     * @return CompletableFuture<DeleteHostGroupResponse>
     */
    public CompletableFuture<DeleteHostGroupResponse> deleteHostGroupAsync(DeleteHostGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteHostGroup);
    }

    /**
     * 删除主机组
     *
     * 删除主机组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteHostGroupRequest 请求对象
     * @return AsyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse>
     */
    public AsyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse> deleteHostGroupAsyncInvoker(
        DeleteHostGroupRequest request) {
        return new AsyncInvoker<DeleteHostGroupRequest, DeleteHostGroupResponse>(request, LtsMeta.deleteHostGroup,
            hcClient);
    }

    /**
     * 删除关键词告警规则
     *
     * 该接口用于删除关键词告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteKeywordsAlarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteKeywordsAlarmRuleResponse>
     */
    public CompletableFuture<DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRuleAsync(
        DeleteKeywordsAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteKeywordsAlarmRule);
    }

    /**
     * 删除关键词告警规则
     *
     * 该接口用于删除关键词告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteKeywordsAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse>
     */
    public AsyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRuleAsyncInvoker(
        DeleteKeywordsAlarmRuleRequest request) {
        return new AsyncInvoker<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse>(request,
            LtsMeta.deleteKeywordsAlarmRule, hcClient);
    }

    /**
     * 删除日志组
     *
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return CompletableFuture<DeleteLogGroupResponse>
     */
    public CompletableFuture<DeleteLogGroupResponse> deleteLogGroupAsync(DeleteLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteLogGroup);
    }

    /**
     * 删除日志组
     *
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>
     */
    public AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroupAsyncInvoker(
        DeleteLogGroupRequest request) {
        return new AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>(request, LtsMeta.deleteLogGroup,
            hcClient);
    }

    /**
     * 删除日志流
     *
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return CompletableFuture<DeleteLogStreamResponse>
     */
    public CompletableFuture<DeleteLogStreamResponse> deleteLogStreamAsync(DeleteLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteLogStream);
    }

    /**
     * 删除日志流
     *
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>
     */
    public AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStreamAsyncInvoker(
        DeleteLogStreamRequest request) {
        return new AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>(request, LtsMeta.deleteLogStream,
            hcClient);
    }

    /**
     * 删除消息模板
     *
     * 该接口用于删除通知模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteNotificationTemplateRequest 请求对象
     * @return CompletableFuture<DeleteNotificationTemplateResponse>
     */
    public CompletableFuture<DeleteNotificationTemplateResponse> deleteNotificationTemplateAsync(
        DeleteNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteNotificationTemplate);
    }

    /**
     * 删除消息模板
     *
     * 该接口用于删除通知模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse>
     */
    public AsyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> deleteNotificationTemplateAsyncInvoker(
        DeleteNotificationTemplateRequest request) {
        return new AsyncInvoker<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse>(request,
            LtsMeta.deleteNotificationTemplate, hcClient);
    }

    /**
     * 删除结构化配置
     *
     * 该接口用于删除指定日志流下的结构化配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteStructTemplateRequest 请求对象
     * @return CompletableFuture<DeleteStructTemplateResponse>
     */
    public CompletableFuture<DeleteStructTemplateResponse> deleteStructTemplateAsync(
        DeleteStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteStructTemplate);
    }

    /**
     * 删除结构化配置
     *
     * 该接口用于删除指定日志流下的结构化配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteStructTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse>
     */
    public AsyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse> deleteStructTemplateAsyncInvoker(
        DeleteStructTemplateRequest request) {
        return new AsyncInvoker<DeleteStructTemplateRequest, DeleteStructTemplateResponse>(request,
            LtsMeta.deleteStructTemplate, hcClient);
    }

    /**
     * 删除日志转储
     *
     * 该接口用于删除OBS转储，DIS转储，DMS转储。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTransferRequest 请求对象
     * @return CompletableFuture<DeleteTransferResponse>
     */
    public CompletableFuture<DeleteTransferResponse> deleteTransferAsync(DeleteTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteTransfer);
    }

    /**
     * 删除日志转储
     *
     * 该接口用于删除OBS转储，DIS转储，DMS转储。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTransferRequest 请求对象
     * @return AsyncInvoker<DeleteTransferRequest, DeleteTransferResponse>
     */
    public AsyncInvoker<DeleteTransferRequest, DeleteTransferResponse> deleteTransferAsyncInvoker(
        DeleteTransferRequest request) {
        return new AsyncInvoker<DeleteTransferRequest, DeleteTransferResponse>(request, LtsMeta.deleteTransfer,
            hcClient);
    }

    /**
     * 关闭超额采集开关
     *
     * 该接口用于将超额采集日志功能关闭。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return CompletableFuture<DisableLogCollectionResponse>
     */
    public CompletableFuture<DisableLogCollectionResponse> disableLogCollectionAsync(
        DisableLogCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.disableLogCollection);
    }

    /**
     * 关闭超额采集开关
     *
     * 该接口用于将超额采集日志功能关闭。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>
     */
    public AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollectionAsyncInvoker(
        DisableLogCollectionRequest request) {
        return new AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>(request,
            LtsMeta.disableLogCollection, hcClient);
    }

    /**
     * 打开超额采集开关
     *
     * 该接口用于将超额采集日志功能打开。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return CompletableFuture<EnableLogCollectionResponse>
     */
    public CompletableFuture<EnableLogCollectionResponse> enableLogCollectionAsync(EnableLogCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.enableLogCollection);
    }

    /**
     * 打开超额采集开关
     *
     * 该接口用于将超额采集日志功能打开。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>
     */
    public AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollectionAsyncInvoker(
        EnableLogCollectionRequest request) {
        return new AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>(request,
            LtsMeta.enableLogCollection, hcClient);
    }

    /**
     * 查询日志接入
     *
     * 查询日志接入列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAccessConfigRequest 请求对象
     * @return CompletableFuture<ListAccessConfigResponse>
     */
    public CompletableFuture<ListAccessConfigResponse> listAccessConfigAsync(ListAccessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listAccessConfig);
    }

    /**
     * 查询日志接入
     *
     * 查询日志接入列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAccessConfigRequest 请求对象
     * @return AsyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse>
     */
    public AsyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse> listAccessConfigAsyncInvoker(
        ListAccessConfigRequest request) {
        return new AsyncInvoker<ListAccessConfigRequest, ListAccessConfigResponse>(request, LtsMeta.listAccessConfig,
            hcClient);
    }

    /**
     * 查询活动或历史告警列表
     *
     * 该接口用于查询告警列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListActiveOrHistoryAlarmsRequest 请求对象
     * @return CompletableFuture<ListActiveOrHistoryAlarmsResponse>
     */
    public CompletableFuture<ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarmsAsync(
        ListActiveOrHistoryAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listActiveOrHistoryAlarms);
    }

    /**
     * 查询活动或历史告警列表
     *
     * 该接口用于查询告警列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListActiveOrHistoryAlarmsRequest 请求对象
     * @return AsyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse>
     */
    public AsyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarmsAsyncInvoker(
        ListActiveOrHistoryAlarmsRequest request) {
        return new AsyncInvoker<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse>(request,
            LtsMeta.listActiveOrHistoryAlarms, hcClient);
    }

    /**
     * 查询结构化模板简略列表
     *
     * 该接口用于查询结构化模板简略列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBreifStructTemplateRequest 请求对象
     * @return CompletableFuture<ListBreifStructTemplateResponse>
     */
    public CompletableFuture<ListBreifStructTemplateResponse> listBreifStructTemplateAsync(
        ListBreifStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listBreifStructTemplate);
    }

    /**
     * 查询结构化模板简略列表
     *
     * 该接口用于查询结构化模板简略列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBreifStructTemplateRequest 请求对象
     * @return AsyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse>
     */
    public AsyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> listBreifStructTemplateAsyncInvoker(
        ListBreifStructTemplateRequest request) {
        return new AsyncInvoker<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse>(request,
            LtsMeta.listBreifStructTemplate, hcClient);
    }

    /**
     * 查询日志流图表
     *
     * 该接口用于查询日志流图表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListChartsRequest 请求对象
     * @return CompletableFuture<ListChartsResponse>
     */
    public CompletableFuture<ListChartsResponse> listChartsAsync(ListChartsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listCharts);
    }

    /**
     * 查询日志流图表
     *
     * 该接口用于查询日志流图表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListChartsRequest 请求对象
     * @return AsyncInvoker<ListChartsRequest, ListChartsResponse>
     */
    public AsyncInvoker<ListChartsRequest, ListChartsResponse> listChartsAsyncInvoker(ListChartsRequest request) {
        return new AsyncInvoker<ListChartsRequest, ListChartsResponse>(request, LtsMeta.listCharts, hcClient);
    }

    /**
     * 查询主机信息
     *
     * 查询主机列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return CompletableFuture<ListHostResponse>
     */
    public CompletableFuture<ListHostResponse> listHostAsync(ListHostRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listHost);
    }

    /**
     * 查询主机信息
     *
     * 查询主机列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return AsyncInvoker<ListHostRequest, ListHostResponse>
     */
    public AsyncInvoker<ListHostRequest, ListHostResponse> listHostAsyncInvoker(ListHostRequest request) {
        return new AsyncInvoker<ListHostRequest, ListHostResponse>(request, LtsMeta.listHost, hcClient);
    }

    /**
     * 查询主机组
     *
     * 查询主机组列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostGroupRequest 请求对象
     * @return CompletableFuture<ListHostGroupResponse>
     */
    public CompletableFuture<ListHostGroupResponse> listHostGroupAsync(ListHostGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listHostGroup);
    }

    /**
     * 查询主机组
     *
     * 查询主机组列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostGroupRequest 请求对象
     * @return AsyncInvoker<ListHostGroupRequest, ListHostGroupResponse>
     */
    public AsyncInvoker<ListHostGroupRequest, ListHostGroupResponse> listHostGroupAsyncInvoker(
        ListHostGroupRequest request) {
        return new AsyncInvoker<ListHostGroupRequest, ListHostGroupResponse>(request, LtsMeta.listHostGroup, hcClient);
    }

    /**
     * 查询关键词告警规则
     *
     * 该接口用于查询关键词告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKeywordsAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListKeywordsAlarmRulesResponse>
     */
    public CompletableFuture<ListKeywordsAlarmRulesResponse> listKeywordsAlarmRulesAsync(
        ListKeywordsAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listKeywordsAlarmRules);
    }

    /**
     * 查询关键词告警规则
     *
     * 该接口用于查询关键词告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKeywordsAlarmRulesRequest 请求对象
     * @return AsyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse>
     */
    public AsyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> listKeywordsAlarmRulesAsyncInvoker(
        ListKeywordsAlarmRulesRequest request) {
        return new AsyncInvoker<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse>(request,
            LtsMeta.listKeywordsAlarmRules, hcClient);
    }

    /**
     * 查询账号下所有日志组
     *
     * 该接口用于查询账号下所有日志组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogGroupsRequest 请求对象
     * @return CompletableFuture<ListLogGroupsResponse>
     */
    public CompletableFuture<ListLogGroupsResponse> listLogGroupsAsync(ListLogGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogGroups);
    }

    /**
     * 查询账号下所有日志组
     *
     * 该接口用于查询账号下所有日志组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogGroupsRequest 请求对象
     * @return AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>
     */
    public AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroupsAsyncInvoker(
        ListLogGroupsRequest request) {
        return new AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>(request, LtsMeta.listLogGroups, hcClient);
    }

    /**
     * 查询日志直方图
     *
     * 查询关键词搜索条数
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogHistogramRequest 请求对象
     * @return CompletableFuture<ListLogHistogramResponse>
     */
    public CompletableFuture<ListLogHistogramResponse> listLogHistogramAsync(ListLogHistogramRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogHistogram);
    }

    /**
     * 查询日志直方图
     *
     * 查询关键词搜索条数
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogHistogramRequest 请求对象
     * @return AsyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse>
     */
    public AsyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse> listLogHistogramAsyncInvoker(
        ListLogHistogramRequest request) {
        return new AsyncInvoker<ListLogHistogramRequest, ListLogHistogramResponse>(request, LtsMeta.listLogHistogram,
            hcClient);
    }

    /**
     * 查询指定日志组下的所有日志流
     *
     * 该接口用于查询指定日志组下的所有日志流信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogStreamRequest 请求对象
     * @return CompletableFuture<ListLogStreamResponse>
     */
    public CompletableFuture<ListLogStreamResponse> listLogStreamAsync(ListLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogStream);
    }

    /**
     * 查询指定日志组下的所有日志流
     *
     * 该接口用于查询指定日志组下的所有日志流信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogStreamRequest 请求对象
     * @return AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse>
     */
    public AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse> listLogStreamAsyncInvoker(
        ListLogStreamRequest request) {
        return new AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse>(request, LtsMeta.listLogStream, hcClient);
    }

    /**
     * 查询日志流信息
     *
     * 该接口用于查询LTS日志流信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogStreamsRequest 请求对象
     * @return CompletableFuture<ListLogStreamsResponse>
     */
    public CompletableFuture<ListLogStreamsResponse> listLogStreamsAsync(ListLogStreamsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogStreams);
    }

    /**
     * 查询日志流信息
     *
     * 该接口用于查询LTS日志流信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogStreamsRequest 请求对象
     * @return AsyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse>
     */
    public AsyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse> listLogStreamsAsyncInvoker(
        ListLogStreamsRequest request) {
        return new AsyncInvoker<ListLogStreamsRequest, ListLogStreamsResponse>(request, LtsMeta.listLogStreams,
            hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询指定日志流下的日志内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogsRequest 请求对象
     * @return CompletableFuture<ListLogsResponse>
     */
    public CompletableFuture<ListLogsResponse> listLogsAsync(ListLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogs);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询指定日志流下的日志内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogsRequest 请求对象
     * @return AsyncInvoker<ListLogsRequest, ListLogsResponse>
     */
    public AsyncInvoker<ListLogsRequest, ListLogsResponse> listLogsAsyncInvoker(ListLogsRequest request) {
        return new AsyncInvoker<ListLogsRequest, ListLogsResponse>(request, LtsMeta.listLogs, hcClient);
    }

    /**
     * 预览消息模板邮件格式
     *
     * 该接口用于预览通知模板邮件格式
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNotificationTemplateRequest 请求对象
     * @return CompletableFuture<ListNotificationTemplateResponse>
     */
    public CompletableFuture<ListNotificationTemplateResponse> listNotificationTemplateAsync(
        ListNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listNotificationTemplate);
    }

    /**
     * 预览消息模板邮件格式
     *
     * 该接口用于预览通知模板邮件格式
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse>
     */
    public AsyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse> listNotificationTemplateAsyncInvoker(
        ListNotificationTemplateRequest request) {
        return new AsyncInvoker<ListNotificationTemplateRequest, ListNotificationTemplateResponse>(request,
            LtsMeta.listNotificationTemplate, hcClient);
    }

    /**
     * 查询消息模板
     *
     * 该接口用于查询通知模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNotificationTemplatesRequest 请求对象
     * @return CompletableFuture<ListNotificationTemplatesResponse>
     */
    public CompletableFuture<ListNotificationTemplatesResponse> listNotificationTemplatesAsync(
        ListNotificationTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listNotificationTemplates);
    }

    /**
     * 查询消息模板
     *
     * 该接口用于查询通知模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNotificationTemplatesRequest 请求对象
     * @return AsyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse>
     */
    public AsyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> listNotificationTemplatesAsyncInvoker(
        ListNotificationTemplatesRequest request) {
        return new AsyncInvoker<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse>(request,
            LtsMeta.listNotificationTemplates, hcClient);
    }

    /**
     * 查询SMN主题
     *
     * 该接口用于查询SMN主题
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNotificationTopicsRequest 请求对象
     * @return CompletableFuture<ListNotificationTopicsResponse>
     */
    public CompletableFuture<ListNotificationTopicsResponse> listNotificationTopicsAsync(
        ListNotificationTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listNotificationTopics);
    }

    /**
     * 查询SMN主题
     *
     * 该接口用于查询SMN主题
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNotificationTopicsRequest 请求对象
     * @return AsyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse>
     */
    public AsyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse> listNotificationTopicsAsyncInvoker(
        ListNotificationTopicsRequest request) {
        return new AsyncInvoker<ListNotificationTopicsRequest, ListNotificationTopicsResponse>(request,
            LtsMeta.listNotificationTopics, hcClient);
    }

    /**
     * 查询结构化日志
     *
     * 该接口用于查询指定日志流下的结构化日志内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return CompletableFuture<ListQueryStructuredLogsResponse>
     */
    public CompletableFuture<ListQueryStructuredLogsResponse> listQueryStructuredLogsAsync(
        ListQueryStructuredLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listQueryStructuredLogs);
    }

    /**
     * 查询结构化日志
     *
     * 该接口用于查询指定日志流下的结构化日志内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQueryStructuredLogsRequest 请求对象
     * @return AsyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse>
     */
    public AsyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogsAsyncInvoker(
        ListQueryStructuredLogsRequest request) {
        return new AsyncInvoker<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse>(request,
            LtsMeta.listQueryStructuredLogs, hcClient);
    }

    /**
     * 查询结构化模板
     *
     * 该接口用于查询结构化模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStructTemplateRequest 请求对象
     * @return CompletableFuture<ListStructTemplateResponse>
     */
    public CompletableFuture<ListStructTemplateResponse> listStructTemplateAsync(ListStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listStructTemplate);
    }

    /**
     * 查询结构化模板
     *
     * 该接口用于查询结构化模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStructTemplateRequest 请求对象
     * @return AsyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse>
     */
    public AsyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse> listStructTemplateAsyncInvoker(
        ListStructTemplateRequest request) {
        return new AsyncInvoker<ListStructTemplateRequest, ListStructTemplateResponse>(request,
            LtsMeta.listStructTemplate, hcClient);
    }

    /**
     * 查询结构化日志（新版）
     *
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return CompletableFuture<ListStructuredLogsWithTimeRangeResponse>
     */
    public CompletableFuture<ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRangeAsync(
        ListStructuredLogsWithTimeRangeRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listStructuredLogsWithTimeRange);
    }

    /**
     * 查询结构化日志（新版）
     *
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStructuredLogsWithTimeRangeRequest 请求对象
     * @return AsyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse>
     */
    public AsyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRangeAsyncInvoker(
        ListStructuredLogsWithTimeRangeRequest request) {
        return new AsyncInvoker<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse>(
            request, LtsMeta.listStructuredLogsWithTimeRange, hcClient);
    }

    /**
     * 查询日志转储
     *
     * 该接口用于查询OBS转储，DIS转储，DMS转储配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTransfersRequest 请求对象
     * @return CompletableFuture<ListTransfersResponse>
     */
    public CompletableFuture<ListTransfersResponse> listTransfersAsync(ListTransfersRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listTransfers);
    }

    /**
     * 查询日志转储
     *
     * 该接口用于查询OBS转储，DIS转储，DMS转储配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTransfersRequest 请求对象
     * @return AsyncInvoker<ListTransfersRequest, ListTransfersResponse>
     */
    public AsyncInvoker<ListTransfersRequest, ListTransfersResponse> listTransfersAsyncInvoker(
        ListTransfersRequest request) {
        return new AsyncInvoker<ListTransfersRequest, ListTransfersResponse>(request, LtsMeta.listTransfers, hcClient);
    }

    /**
     * 注册DMS kafka实例
     *
     * 该接口用于注册DMS kafka实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterDmsKafkaInstanceRequest 请求对象
     * @return CompletableFuture<RegisterDmsKafkaInstanceResponse>
     */
    public CompletableFuture<RegisterDmsKafkaInstanceResponse> registerDmsKafkaInstanceAsync(
        RegisterDmsKafkaInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.registerDmsKafkaInstance);
    }

    /**
     * 注册DMS kafka实例
     *
     * 该接口用于注册DMS kafka实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterDmsKafkaInstanceRequest 请求对象
     * @return AsyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse>
     */
    public AsyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> registerDmsKafkaInstanceAsyncInvoker(
        RegisterDmsKafkaInstanceRequest request) {
        return new AsyncInvoker<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse>(request,
            LtsMeta.registerDmsKafkaInstance, hcClient);
    }

    /**
     * 查询单个消息模板
     *
     * 该接口用于查询单个通知模板
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNotificationTemplateRequest 请求对象
     * @return CompletableFuture<ShowNotificationTemplateResponse>
     */
    public CompletableFuture<ShowNotificationTemplateResponse> showNotificationTemplateAsync(
        ShowNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showNotificationTemplate);
    }

    /**
     * 查询单个消息模板
     *
     * 该接口用于查询单个通知模板
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse>
     */
    public AsyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> showNotificationTemplateAsyncInvoker(
        ShowNotificationTemplateRequest request) {
        return new AsyncInvoker<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse>(request,
            LtsMeta.showNotificationTemplate, hcClient);
    }

    /**
     * 查询结构化配置
     *
     * 该接口用于查询指定日志流下的结构化配置内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowStructTemplateRequest 请求对象
     * @return CompletableFuture<ShowStructTemplateResponse>
     */
    public CompletableFuture<ShowStructTemplateResponse> showStructTemplateAsync(ShowStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showStructTemplate);
    }

    /**
     * 查询结构化配置
     *
     * 该接口用于查询指定日志流下的结构化配置内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowStructTemplateRequest 请求对象
     * @return AsyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse>
     */
    public AsyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse> showStructTemplateAsyncInvoker(
        ShowStructTemplateRequest request) {
        return new AsyncInvoker<ShowStructTemplateRequest, ShowStructTemplateResponse>(request,
            LtsMeta.showStructTemplate, hcClient);
    }

    /**
     * 修改日志接入
     *
     * 修改日志接入
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAccessConfigRequest 请求对象
     * @return CompletableFuture<UpdateAccessConfigResponse>
     */
    public CompletableFuture<UpdateAccessConfigResponse> updateAccessConfigAsync(UpdateAccessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateAccessConfig);
    }

    /**
     * 修改日志接入
     *
     * 修改日志接入
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAccessConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse>
     */
    public AsyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse> updateAccessConfigAsyncInvoker(
        UpdateAccessConfigRequest request) {
        return new AsyncInvoker<UpdateAccessConfigRequest, UpdateAccessConfigResponse>(request,
            LtsMeta.updateAccessConfig, hcClient);
    }

    /**
     * 修改主机组
     *
     * 修改主机组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostGroupRequest 请求对象
     * @return CompletableFuture<UpdateHostGroupResponse>
     */
    public CompletableFuture<UpdateHostGroupResponse> updateHostGroupAsync(UpdateHostGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateHostGroup);
    }

    /**
     * 修改主机组
     *
     * 修改主机组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostGroupRequest 请求对象
     * @return AsyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse>
     */
    public AsyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse> updateHostGroupAsyncInvoker(
        UpdateHostGroupRequest request) {
        return new AsyncInvoker<UpdateHostGroupRequest, UpdateHostGroupResponse>(request, LtsMeta.updateHostGroup,
            hcClient);
    }

    /**
     * 修改关键词告警规则
     *
     * 该接口用于修改关键词告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateKeywordsAlarmRuleRequest 请求对象
     * @return CompletableFuture<UpdateKeywordsAlarmRuleResponse>
     */
    public CompletableFuture<UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRuleAsync(
        UpdateKeywordsAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateKeywordsAlarmRule);
    }

    /**
     * 修改关键词告警规则
     *
     * 该接口用于修改关键词告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateKeywordsAlarmRuleRequest 请求对象
     * @return AsyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse>
     */
    public AsyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRuleAsyncInvoker(
        UpdateKeywordsAlarmRuleRequest request) {
        return new AsyncInvoker<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse>(request,
            LtsMeta.updateKeywordsAlarmRule, hcClient);
    }

    /**
     * 修改日志组
     *
     * 该接口用于修改指定日志组下的日志存储时长。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return CompletableFuture<UpdateLogGroupResponse>
     */
    public CompletableFuture<UpdateLogGroupResponse> updateLogGroupAsync(UpdateLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateLogGroup);
    }

    /**
     * 修改日志组
     *
     * 该接口用于修改指定日志组下的日志存储时长。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>
     */
    public AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroupAsyncInvoker(
        UpdateLogGroupRequest request) {
        return new AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>(request, LtsMeta.updateLogGroup,
            hcClient);
    }

    /**
     * 修改消息模板
     *
     * 该接口用于修改通知模板,根据名称进行修改。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateNotificationTemplateRequest 请求对象
     * @return CompletableFuture<UpdateNotificationTemplateResponse>
     */
    public CompletableFuture<UpdateNotificationTemplateResponse> updateNotificationTemplateAsync(
        UpdateNotificationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateNotificationTemplate);
    }

    /**
     * 修改消息模板
     *
     * 该接口用于修改通知模板,根据名称进行修改。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateNotificationTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse>
     */
    public AsyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> updateNotificationTemplateAsyncInvoker(
        UpdateNotificationTemplateRequest request) {
        return new AsyncInvoker<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse>(request,
            LtsMeta.updateNotificationTemplate, hcClient);
    }

    /**
     * 通过结构化模板修改结构化配置（新）
     *
     * 该接口通过结构化模板修改结构化配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateStructConfigRequest 请求对象
     * @return CompletableFuture<UpdateStructConfigResponse>
     */
    public CompletableFuture<UpdateStructConfigResponse> updateStructConfigAsync(UpdateStructConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateStructConfig);
    }

    /**
     * 通过结构化模板修改结构化配置（新）
     *
     * 该接口通过结构化模板修改结构化配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateStructConfigRequest 请求对象
     * @return AsyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse>
     */
    public AsyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse> updateStructConfigAsyncInvoker(
        UpdateStructConfigRequest request) {
        return new AsyncInvoker<UpdateStructConfigRequest, UpdateStructConfigResponse>(request,
            LtsMeta.updateStructConfig, hcClient);
    }

    /**
     * 修改结构化配置
     *
     * 该接口用于修改指定日志流下的结构化配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateStructTemplateRequest 请求对象
     * @return CompletableFuture<UpdateStructTemplateResponse>
     */
    public CompletableFuture<UpdateStructTemplateResponse> updateStructTemplateAsync(
        UpdateStructTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateStructTemplate);
    }

    /**
     * 修改结构化配置
     *
     * 该接口用于修改指定日志流下的结构化配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateStructTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse>
     */
    public AsyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse> updateStructTemplateAsyncInvoker(
        UpdateStructTemplateRequest request) {
        return new AsyncInvoker<UpdateStructTemplateRequest, UpdateStructTemplateResponse>(request,
            LtsMeta.updateStructTemplate, hcClient);
    }

    /**
     * 更新日志转储
     *
     * 该接口用于更新OBS转储，DIS转储，DMS转储。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTransferRequest 请求对象
     * @return CompletableFuture<UpdateTransferResponse>
     */
    public CompletableFuture<UpdateTransferResponse> updateTransferAsync(UpdateTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateTransfer);
    }

    /**
     * 更新日志转储
     *
     * 该接口用于更新OBS转储，DIS转储，DMS转储。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTransferRequest 请求对象
     * @return AsyncInvoker<UpdateTransferRequest, UpdateTransferResponse>
     */
    public AsyncInvoker<UpdateTransferRequest, UpdateTransferResponse> updateTransferAsyncInvoker(
        UpdateTransferRequest request) {
        return new AsyncInvoker<UpdateTransferRequest, UpdateTransferResponse>(request, LtsMeta.updateTransfer,
            hcClient);
    }

    /**
     * 创建接入规则
     *
     * 该接口用于创建aom日志接入lts规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAomMappingRulesRequest 请求对象
     * @return CompletableFuture<CreateAomMappingRulesResponse>
     */
    public CompletableFuture<CreateAomMappingRulesResponse> createAomMappingRulesAsync(
        CreateAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createAomMappingRules);
    }

    /**
     * 创建接入规则
     *
     * 该接口用于创建aom日志接入lts规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse>
     */
    public AsyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> createAomMappingRulesAsyncInvoker(
        CreateAomMappingRulesRequest request) {
        return new AsyncInvoker<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse>(request,
            LtsMeta.createAomMappingRules, hcClient);
    }

    /**
     * 删除接入规则
     *
     * 该接口用于删除lts接入规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAomMappingRulesRequest 请求对象
     * @return CompletableFuture<DeleteAomMappingRulesResponse>
     */
    public CompletableFuture<DeleteAomMappingRulesResponse> deleteAomMappingRulesAsync(
        DeleteAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteAomMappingRules);
    }

    /**
     * 删除接入规则
     *
     * 该接口用于删除lts接入规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse>
     */
    public AsyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> deleteAomMappingRulesAsyncInvoker(
        DeleteAomMappingRulesRequest request) {
        return new AsyncInvoker<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse>(request,
            LtsMeta.deleteAomMappingRules, hcClient);
    }

    /**
     * 查询单个接入规则
     *
     * 该接口用于查询单个aom日志接入lts
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return CompletableFuture<ShowAomMappingRuleResponse>
     */
    public CompletableFuture<ShowAomMappingRuleResponse> showAomMappingRuleAsync(ShowAomMappingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showAomMappingRule);
    }

    /**
     * 查询单个接入规则
     *
     * 该接口用于查询单个aom日志接入lts
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAomMappingRuleRequest 请求对象
     * @return AsyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse>
     */
    public AsyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> showAomMappingRuleAsyncInvoker(
        ShowAomMappingRuleRequest request) {
        return new AsyncInvoker<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse>(request,
            LtsMeta.showAomMappingRule, hcClient);
    }

    /**
     * 查询所有接入规则
     *
     * 该接口用于查询aom日志所有接入lts规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAomMappingRulesRequest 请求对象
     * @return CompletableFuture<ShowAomMappingRulesResponse>
     */
    public CompletableFuture<ShowAomMappingRulesResponse> showAomMappingRulesAsync(ShowAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.showAomMappingRules);
    }

    /**
     * 查询所有接入规则
     *
     * 该接口用于查询aom日志所有接入lts规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse>
     */
    public AsyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> showAomMappingRulesAsyncInvoker(
        ShowAomMappingRulesRequest request) {
        return new AsyncInvoker<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse>(request,
            LtsMeta.showAomMappingRules, hcClient);
    }

    /**
     * 修改接入规则
     *
     * 该接口用于修改接入规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAomMappingRulesRequest 请求对象
     * @return CompletableFuture<UpdateAomMappingRulesResponse>
     */
    public CompletableFuture<UpdateAomMappingRulesResponse> updateAomMappingRulesAsync(
        UpdateAomMappingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateAomMappingRules);
    }

    /**
     * 修改接入规则
     *
     * 该接口用于修改接入规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAomMappingRulesRequest 请求对象
     * @return AsyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse>
     */
    public AsyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> updateAomMappingRulesAsyncInvoker(
        UpdateAomMappingRulesRequest request) {
        return new AsyncInvoker<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse>(request,
            LtsMeta.updateAomMappingRules, hcClient);
    }

    /**
     * 创建SQL告警规则
     *
     * 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSqlAlarmRuleRequest 请求对象
     * @return CompletableFuture<CreateSqlAlarmRuleResponse>
     */
    public CompletableFuture<CreateSqlAlarmRuleResponse> createSqlAlarmRuleAsync(CreateSqlAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createSqlAlarmRule);
    }

    /**
     * 创建SQL告警规则
     *
     * 该接口用于创建SQL告警，目前每个帐户最多可以创建共200个关键词告警与SQL告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSqlAlarmRuleRequest 请求对象
     * @return AsyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse>
     */
    public AsyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> createSqlAlarmRuleAsyncInvoker(
        CreateSqlAlarmRuleRequest request) {
        return new AsyncInvoker<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse>(request,
            LtsMeta.createSqlAlarmRule, hcClient);
    }

    /**
     * 删除SQL告警规则
     *
     * 该接口用于删除SQL告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlAlarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteSqlAlarmRuleResponse>
     */
    public CompletableFuture<DeleteSqlAlarmRuleResponse> deleteSqlAlarmRuleAsync(DeleteSqlAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteSqlAlarmRule);
    }

    /**
     * 删除SQL告警规则
     *
     * 该接口用于删除SQL告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse>
     */
    public AsyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> deleteSqlAlarmRuleAsyncInvoker(
        DeleteSqlAlarmRuleRequest request) {
        return new AsyncInvoker<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse>(request,
            LtsMeta.deleteSqlAlarmRule, hcClient);
    }

    /**
     * 查询SQL告警规则
     *
     * 该接口用于查询SQL告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSqlAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListSqlAlarmRulesResponse>
     */
    public CompletableFuture<ListSqlAlarmRulesResponse> listSqlAlarmRulesAsync(ListSqlAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listSqlAlarmRules);
    }

    /**
     * 查询SQL告警规则
     *
     * 该接口用于查询SQL告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSqlAlarmRulesRequest 请求对象
     * @return AsyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse>
     */
    public AsyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> listSqlAlarmRulesAsyncInvoker(
        ListSqlAlarmRulesRequest request) {
        return new AsyncInvoker<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse>(request, LtsMeta.listSqlAlarmRules,
            hcClient);
    }

    /**
     * 切换告警规则状态
     *
     * 改变告警规则状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmRuleStatusRequest 请求对象
     * @return CompletableFuture<UpdateAlarmRuleStatusResponse>
     */
    public CompletableFuture<UpdateAlarmRuleStatusResponse> updateAlarmRuleStatusAsync(
        UpdateAlarmRuleStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateAlarmRuleStatus);
    }

    /**
     * 切换告警规则状态
     *
     * 改变告警规则状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmRuleStatusRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse>
     */
    public AsyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> updateAlarmRuleStatusAsyncInvoker(
        UpdateAlarmRuleStatusRequest request) {
        return new AsyncInvoker<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse>(request,
            LtsMeta.updateAlarmRuleStatus, hcClient);
    }

    /**
     * 修改SQL告警规则
     *
     * 该接口用于修改SQL告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateSqlAlarmRuleRequest 请求对象
     * @return CompletableFuture<UpdateSqlAlarmRuleResponse>
     */
    public CompletableFuture<UpdateSqlAlarmRuleResponse> updateSqlAlarmRuleAsync(UpdateSqlAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateSqlAlarmRule);
    }

    /**
     * 修改SQL告警规则
     *
     * 该接口用于修改SQL告警
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateSqlAlarmRuleRequest 请求对象
     * @return AsyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse>
     */
    public AsyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> updateSqlAlarmRuleAsyncInvoker(
        UpdateSqlAlarmRuleRequest request) {
        return new AsyncInvoker<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse>(request,
            LtsMeta.updateSqlAlarmRule, hcClient);
    }

}
