package com.huaweicloud.sdk.smsapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendDiffSmsRequest;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendDiffSmsResponse;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendSmsRequest;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendSmsResponse;

public class SMSApiClient {

    protected HcClient hcClient;

    public SMSApiClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SMSApiClient> newBuilder() {
        ClientBuilder<SMSApiClient> clientBuilder = new ClientBuilder<>(SMSApiClient::new, "SMSApiCredentials");
        return clientBuilder;
    }

    /**
     * 发送分批短信
     *
     * 发送分批短信
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendDiffSmsRequest 请求对象
     * @return BatchSendDiffSmsResponse
     */
    public BatchSendDiffSmsResponse batchSendDiffSms(BatchSendDiffSmsRequest request) {
        return hcClient.syncInvokeHttp(request, SMSApiMeta.batchSendDiffSms);
    }

    /**
     * 发送分批短信
     *
     * 发送分批短信
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendDiffSmsRequest 请求对象
     * @return SyncInvoker<BatchSendDiffSmsRequest, BatchSendDiffSmsResponse>
     */
    public SyncInvoker<BatchSendDiffSmsRequest, BatchSendDiffSmsResponse> batchSendDiffSmsInvoker(
        BatchSendDiffSmsRequest request) {
        return new SyncInvoker<>(request, SMSApiMeta.batchSendDiffSms, hcClient);
    }

    /**
     * 发送短信
     *
     * ## 典型场景 ##
     *  SP调用此接口发送短信。
     * ## 接口功能 ##
     *  该接口用于SP请求短信平台向指定用户发送短信。
     * ## 使用说明 ##
     *      前提条件
     *   i.  已在短信平台获取该短信能力开放应用的app_key、app_secret。
     * 
     *     注意事项
     *   a.  群发短信时，如果“to”参数携带的号码中包含除数字和+之外的其他字符，则无法向该参数携带的所有号码发送短信。如果“to”参数携带的所有号码只包含数字和+，但部分号码不符合号码规则要求，则在响应消息中会通过状态码标识发送失败的号码，不影响其他正常号码的短信发送。号码之间以英文逗号分隔，每个号码最大长度为21位，最多允许携带500个号码。
     *   b. 本接口支持特殊AK/SK认证。
     *   c.  X-Sdk-Date不能与发送请求时的本地时间相差太大（15分钟），否则会导致鉴权失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendSmsRequest 请求对象
     * @return BatchSendSmsResponse
     */
    public BatchSendSmsResponse batchSendSms(BatchSendSmsRequest request) {
        return hcClient.syncInvokeHttp(request, SMSApiMeta.batchSendSms);
    }

    /**
     * 发送短信
     *
     * ## 典型场景 ##
     *  SP调用此接口发送短信。
     * ## 接口功能 ##
     *  该接口用于SP请求短信平台向指定用户发送短信。
     * ## 使用说明 ##
     *      前提条件
     *   i.  已在短信平台获取该短信能力开放应用的app_key、app_secret。
     * 
     *     注意事项
     *   a.  群发短信时，如果“to”参数携带的号码中包含除数字和+之外的其他字符，则无法向该参数携带的所有号码发送短信。如果“to”参数携带的所有号码只包含数字和+，但部分号码不符合号码规则要求，则在响应消息中会通过状态码标识发送失败的号码，不影响其他正常号码的短信发送。号码之间以英文逗号分隔，每个号码最大长度为21位，最多允许携带500个号码。
     *   b. 本接口支持特殊AK/SK认证。
     *   c.  X-Sdk-Date不能与发送请求时的本地时间相差太大（15分钟），否则会导致鉴权失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendSmsRequest 请求对象
     * @return SyncInvoker<BatchSendSmsRequest, BatchSendSmsResponse>
     */
    public SyncInvoker<BatchSendSmsRequest, BatchSendSmsResponse> batchSendSmsInvoker(BatchSendSmsRequest request) {
        return new SyncInvoker<>(request, SMSApiMeta.batchSendSms, hcClient);
    }

}
