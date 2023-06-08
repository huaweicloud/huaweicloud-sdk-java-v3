package com.huaweicloud.sdk.obs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.obs.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class ObsAsyncClient {

    protected HcClient hcClient;

    public ObsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ObsAsyncClient> newBuilder() {
        return new ClientBuilder<>(ObsAsyncClient::new, "ObsCredentials");
    }

    /**
     * 获取桶的消息通知配置
     *
     * 获取指定桶的消息通知配置信息。
     * 
     * 为了能成功执行此配置操作，需要确保执行者拥有GetBucketNotification权限。默认情况下只有桶的所有者拥有该权限，但可以通过设置桶策略或用户策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetBucketNotificationRequest 请求对象
     * @return CompletableFuture<GetBucketNotificationResponse>
     */
    public CompletableFuture<GetBucketNotificationResponse> getBucketNotificationAsync(
        GetBucketNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.getBucketNotification);
    }

    /**
     * 获取桶的消息通知配置
     *
     * 获取指定桶的消息通知配置信息。
     * 
     * 为了能成功执行此配置操作，需要确保执行者拥有GetBucketNotification权限。默认情况下只有桶的所有者拥有该权限，但可以通过设置桶策略或用户策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetBucketNotificationRequest 请求对象
     * @return AsyncInvoker<GetBucketNotificationRequest, GetBucketNotificationResponse>
     */
    public AsyncInvoker<GetBucketNotificationRequest, GetBucketNotificationResponse> getBucketNotificationAsyncInvoker(
        GetBucketNotificationRequest request) {
        return new AsyncInvoker<GetBucketNotificationRequest, GetBucketNotificationResponse>(request,
            ObsMeta.getBucketNotification, hcClient);
    }

    /**
     * 获取对象内容
     *
     * GET操作从对象存储下载对象。使用GET接口前，请确认必须拥有对象的READ权限。如果对象Owner向匿名用户授予READ访问权限，则可以在不使用鉴权头域的情况下访问该对象。
     * 
     * #### 服务端加密 ####
     * 如果客户端的对象上传时，使用了客户提供的加密密钥进行服务端加密，当下载对象时，同样也必须在消息中提供密钥。
     * 
     * #### 多版本 ####
     * 默认情况下，获取的是最新版本的对象。如果最新版本的对象是删除标记，则返回对象不存在。如果要获取指定版本的对象，请求可携带versionId消息参数。
     * 
     * #### 归档存储对象 ####
     * 如果要下载的对象是归档存储类对象，由于对象存储在存档设备中，您必须先使用对象取回，然后才能下载该归档存储对象。对象处于不同的取回状态时，给出不同响应：如果对象已取回，下载对象成功时需要返回x-obs-restore头域指示取回失效时间。对未取回或正在取回的归档存储对象发送下载请求时，会返回错误403 Forbidden。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetObjectRequest 请求对象
     * @return CompletableFuture<GetObjectResponse>
     */
    public CompletableFuture<GetObjectResponse> getObjectAsync(GetObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.getObject);
    }

    /**
     * 获取对象内容
     *
     * GET操作从对象存储下载对象。使用GET接口前，请确认必须拥有对象的READ权限。如果对象Owner向匿名用户授予READ访问权限，则可以在不使用鉴权头域的情况下访问该对象。
     * 
     * #### 服务端加密 ####
     * 如果客户端的对象上传时，使用了客户提供的加密密钥进行服务端加密，当下载对象时，同样也必须在消息中提供密钥。
     * 
     * #### 多版本 ####
     * 默认情况下，获取的是最新版本的对象。如果最新版本的对象是删除标记，则返回对象不存在。如果要获取指定版本的对象，请求可携带versionId消息参数。
     * 
     * #### 归档存储对象 ####
     * 如果要下载的对象是归档存储类对象，由于对象存储在存档设备中，您必须先使用对象取回，然后才能下载该归档存储对象。对象处于不同的取回状态时，给出不同响应：如果对象已取回，下载对象成功时需要返回x-obs-restore头域指示取回失效时间。对未取回或正在取回的归档存储对象发送下载请求时，会返回错误403 Forbidden。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetObjectRequest 请求对象
     * @return AsyncInvoker<GetObjectRequest, GetObjectResponse>
     */
    public AsyncInvoker<GetObjectRequest, GetObjectResponse> getObjectAsyncInvoker(GetObjectRequest request) {
        return new AsyncInvoker<GetObjectRequest, GetObjectResponse>(request, ObsMeta.getObject, hcClient);
    }

    /**
     * 设置桶的消息通知配置
     *
     * OBS消息通知功能能够帮助您对桶的重要的操作及时通知到您，确保您安全、及时知道发生在桶上的关键事件。
     * 
     * 默认情况下，您的桶没有配置事件通知。这个时候桶的通知配置将是一个空NotificationConfiguration。对已配置有事件通知的桶，可以通过添加空NotificationConfiguration元素禁用消息通知功能。
     * 
     * &lt;NotificationConfiguration&gt;
     * &lt;/NotificationConfiguration&gt; 
     * 
     * 目前对象存储服务（OBS）支持包括简单通知服务（SMN）、函数工作流服务（FunctionGraph）在内的两种桶通知服务配置。以SMN为例，当OBS接收到配置消息通知的请求后，会验证指定的消息通知服务（SMN）主题是否存在及主题策略是否授权给了对象存储服务，验证通过后会向该主题订阅者发送一个测试消息通知。
     * 
     * 为了能成功执行此配置操作，需要确保执行者拥有PutBucketNotification权限。默认情况下只有桶的所有者拥有该权限，但可以通过设置桶策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBucketNotificationRequest 请求对象
     * @return CompletableFuture<SetBucketNotificationResponse>
     */
    public CompletableFuture<SetBucketNotificationResponse> setBucketNotificationAsync(
        SetBucketNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, ObsMeta.setBucketNotification);
    }

    /**
     * 设置桶的消息通知配置
     *
     * OBS消息通知功能能够帮助您对桶的重要的操作及时通知到您，确保您安全、及时知道发生在桶上的关键事件。
     * 
     * 默认情况下，您的桶没有配置事件通知。这个时候桶的通知配置将是一个空NotificationConfiguration。对已配置有事件通知的桶，可以通过添加空NotificationConfiguration元素禁用消息通知功能。
     * 
     * &lt;NotificationConfiguration&gt;
     * &lt;/NotificationConfiguration&gt; 
     * 
     * 目前对象存储服务（OBS）支持包括简单通知服务（SMN）、函数工作流服务（FunctionGraph）在内的两种桶通知服务配置。以SMN为例，当OBS接收到配置消息通知的请求后，会验证指定的消息通知服务（SMN）主题是否存在及主题策略是否授权给了对象存储服务，验证通过后会向该主题订阅者发送一个测试消息通知。
     * 
     * 为了能成功执行此配置操作，需要确保执行者拥有PutBucketNotification权限。默认情况下只有桶的所有者拥有该权限，但可以通过设置桶策略授权给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBucketNotificationRequest 请求对象
     * @return AsyncInvoker<SetBucketNotificationRequest, SetBucketNotificationResponse>
     */
    public AsyncInvoker<SetBucketNotificationRequest, SetBucketNotificationResponse> setBucketNotificationAsyncInvoker(
        SetBucketNotificationRequest request) {
        return new AsyncInvoker<SetBucketNotificationRequest, SetBucketNotificationResponse>(request,
            ObsMeta.setBucketNotification, hcClient);
    }

}
