package com.huaweicloud.sdk.iotdm.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iotdm.v5.model.BindInstanceTagsRequest;
import com.huaweicloud.sdk.iotdm.v5.model.BindInstanceTagsResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ChangeInstanceChargeModeRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ChangeInstanceChargeModeResponse;
import com.huaweicloud.sdk.iotdm.v5.model.CreateInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.CreateInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstanceFlavorsRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstanceFlavorsResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstanceTasksRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstanceTasksResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstancesRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstancesResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.RetryInstanceTaskRequest;
import com.huaweicloud.sdk.iotdm.v5.model.RetryInstanceTaskResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ShowInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ShowInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ShowInstanceTaskRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ShowInstanceTaskResponse;
import com.huaweicloud.sdk.iotdm.v5.model.UnbindInstanceTagsRequest;
import com.huaweicloud.sdk.iotdm.v5.model.UnbindInstanceTagsResponse;
import com.huaweicloud.sdk.iotdm.v5.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.UpdateInstanceResponse;

import java.util.concurrent.CompletableFuture;

public class IoTDMAsyncClient {

    protected HcClient hcClient;

    public IoTDMAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTDMAsyncClient> newBuilder() {
        ClientBuilder<IoTDMAsyncClient> clientBuilder = new ClientBuilder<>(IoTDMAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 查询实例规格列表
     *
     * 用户可以调用此接口查询设备接入服务支持的实例规格列表。支持的实例规格请参见[[产品规格说明](https://support.huaweicloud.com/productdesc-iothub/iot_04_0014.html)](tag:hws)[[产品规格说明](https://support.huaweicloud.com/intl/zh-cn/productdesc-iothub/iot_04_0014.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceFlavorsRequest 请求对象
     * @return CompletableFuture<ListInstanceFlavorsResponse>
     */
    public CompletableFuture<ListInstanceFlavorsResponse> listInstanceFlavorsAsync(ListInstanceFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.listInstanceFlavors);
    }

    /**
     * 查询实例规格列表
     *
     * 用户可以调用此接口查询设备接入服务支持的实例规格列表。支持的实例规格请参见[[产品规格说明](https://support.huaweicloud.com/productdesc-iothub/iot_04_0014.html)](tag:hws)[[产品规格说明](https://support.huaweicloud.com/intl/zh-cn/productdesc-iothub/iot_04_0014.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceFlavorsRequest 请求对象
     * @return AsyncInvoker<ListInstanceFlavorsRequest, ListInstanceFlavorsResponse>
     */
    public AsyncInvoker<ListInstanceFlavorsRequest, ListInstanceFlavorsResponse> listInstanceFlavorsAsyncInvoker(
        ListInstanceFlavorsRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.listInstanceFlavors, hcClient);
    }

    /**
     * 添加实例标签
     *
     * 添加实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindInstanceTagsRequest 请求对象
     * @return CompletableFuture<BindInstanceTagsResponse>
     */
    public CompletableFuture<BindInstanceTagsResponse> bindInstanceTagsAsync(BindInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.bindInstanceTags);
    }

    /**
     * 添加实例标签
     *
     * 添加实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindInstanceTagsRequest 请求对象
     * @return AsyncInvoker<BindInstanceTagsRequest, BindInstanceTagsResponse>
     */
    public AsyncInvoker<BindInstanceTagsRequest, BindInstanceTagsResponse> bindInstanceTagsAsyncInvoker(
        BindInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.bindInstanceTags, hcClient);
    }

    /**
     * 修改实例计费模式
     *
     * 修改设备接入实例的计费模式，支持将按需计费模式修改为包年/包月计费模式。
     * 接口约束：当前实例的规格支持包年/包月计费模式时，才可以修改实例的计费模式为包年/包月。支持的实例规格请参见[[产品规格说明](https://support.huaweicloud.com/productdesc-iothub/iot_04_0014.html)](tag:hws)[[产品规格说明](https://support.huaweicloud.com/intl/zh-cn/productdesc-iothub/iot_04_0014.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceChargeModeRequest 请求对象
     * @return CompletableFuture<ChangeInstanceChargeModeResponse>
     */
    public CompletableFuture<ChangeInstanceChargeModeResponse> changeInstanceChargeModeAsync(
        ChangeInstanceChargeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.changeInstanceChargeMode);
    }

    /**
     * 修改实例计费模式
     *
     * 修改设备接入实例的计费模式，支持将按需计费模式修改为包年/包月计费模式。
     * 接口约束：当前实例的规格支持包年/包月计费模式时，才可以修改实例的计费模式为包年/包月。支持的实例规格请参见[[产品规格说明](https://support.huaweicloud.com/productdesc-iothub/iot_04_0014.html)](tag:hws)[[产品规格说明](https://support.huaweicloud.com/intl/zh-cn/productdesc-iothub/iot_04_0014.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceChargeModeRequest 请求对象
     * @return AsyncInvoker<ChangeInstanceChargeModeRequest, ChangeInstanceChargeModeResponse>
     */
    public AsyncInvoker<ChangeInstanceChargeModeRequest, ChangeInstanceChargeModeResponse> changeInstanceChargeModeAsyncInvoker(
        ChangeInstanceChargeModeRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.changeInstanceChargeMode, hcClient);
    }

    /**
     * 创建设备接入实例
     *
     * 用户可以调用此接口创建一个设备接入实例。支持的实例规格请参见[[产品规格说明](https://support.huaweicloud.com/productdesc-iothub/iot_04_0014.html)](tag:hws)[[产品规格说明](https://support.huaweicloud.com/intl/zh-cn/productdesc-iothub/iot_04_0014.html)](tag:hws_hk)。
     * [接口约束：
     * - 请保证账户余额充足，此接口无法使用优惠券支付，在创建包年/包月实例时，若余额不足会创建一个待支付订单。
     * - 若想使用优惠券，请将请求中的is_auto_pay字段设置为false，参考[\&quot;支付包年/包月产品订单\&quot;](https://support.huaweicloud.com/api-bpconsole/api_order_00016.html#section0)进行支付，或者在华为云官网页面使用优惠券进行支付。
     * - 如果您需要退订包年/包月资源，请参考[\&quot;退订包年/包月资源\&quot;](https://support.huaweicloud.com/api-bpconsole/api_order_00019.html)。](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.createInstance);
    }

    /**
     * 创建设备接入实例
     *
     * 用户可以调用此接口创建一个设备接入实例。支持的实例规格请参见[[产品规格说明](https://support.huaweicloud.com/productdesc-iothub/iot_04_0014.html)](tag:hws)[[产品规格说明](https://support.huaweicloud.com/intl/zh-cn/productdesc-iothub/iot_04_0014.html)](tag:hws_hk)。
     * [接口约束：
     * - 请保证账户余额充足，此接口无法使用优惠券支付，在创建包年/包月实例时，若余额不足会创建一个待支付订单。
     * - 若想使用优惠券，请将请求中的is_auto_pay字段设置为false，参考[\&quot;支付包年/包月产品订单\&quot;](https://support.huaweicloud.com/api-bpconsole/api_order_00016.html#section0)进行支付，或者在华为云官网页面使用优惠券进行支付。
     * - 如果您需要退订包年/包月资源，请参考[\&quot;退订包年/包月资源\&quot;](https://support.huaweicloud.com/api-bpconsole/api_order_00019.html)。](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.createInstance, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除设备接入实例。约束：此接口仅支持删除按需计费的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除设备接入实例。约束：此接口仅支持删除按需计费的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.deleteInstance, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 用户可以调用此接口查询设备接入实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.listInstances);
    }

    /**
     * 查询实例列表
     *
     * 用户可以调用此接口查询设备接入实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.listInstances, hcClient);
    }

    /**
     * 修改实例规格信息
     *
     * 修改设备接入实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.resizeInstance);
    }

    /**
     * 修改实例规格信息
     *
     * 修改设备接入实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.resizeInstance, hcClient);
    }

    /**
     * 查询实例详情
     *
     * 查询设备接入实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.showInstance);
    }

    /**
     * 查询实例详情
     *
     * 查询设备接入实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.showInstance, hcClient);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindInstanceTagsRequest 请求对象
     * @return CompletableFuture<UnbindInstanceTagsResponse>
     */
    public CompletableFuture<UnbindInstanceTagsResponse> unbindInstanceTagsAsync(UnbindInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.unbindInstanceTags);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindInstanceTagsRequest 请求对象
     * @return AsyncInvoker<UnbindInstanceTagsRequest, UnbindInstanceTagsResponse>
     */
    public AsyncInvoker<UnbindInstanceTagsRequest, UnbindInstanceTagsResponse> unbindInstanceTagsAsyncInvoker(
        UnbindInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.unbindInstanceTags, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改设备接入实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改设备接入实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.updateInstance, hcClient);
    }

    /**
     * 查询实例任务列表
     *
     * 用户可以调用此接口查询设备接入实例任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTasksRequest 请求对象
     * @return CompletableFuture<ListInstanceTasksResponse>
     */
    public CompletableFuture<ListInstanceTasksResponse> listInstanceTasksAsync(ListInstanceTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.listInstanceTasks);
    }

    /**
     * 查询实例任务列表
     *
     * 用户可以调用此接口查询设备接入实例任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTasksRequest 请求对象
     * @return AsyncInvoker<ListInstanceTasksRequest, ListInstanceTasksResponse>
     */
    public AsyncInvoker<ListInstanceTasksRequest, ListInstanceTasksResponse> listInstanceTasksAsyncInvoker(
        ListInstanceTasksRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.listInstanceTasks, hcClient);
    }

    /**
     * 重试实例任务
     *
     * 用户可以调用此接口对运行失败的实例任务进行重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryInstanceTaskRequest 请求对象
     * @return CompletableFuture<RetryInstanceTaskResponse>
     */
    public CompletableFuture<RetryInstanceTaskResponse> retryInstanceTaskAsync(RetryInstanceTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.retryInstanceTask);
    }

    /**
     * 重试实例任务
     *
     * 用户可以调用此接口对运行失败的实例任务进行重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryInstanceTaskRequest 请求对象
     * @return AsyncInvoker<RetryInstanceTaskRequest, RetryInstanceTaskResponse>
     */
    public AsyncInvoker<RetryInstanceTaskRequest, RetryInstanceTaskResponse> retryInstanceTaskAsyncInvoker(
        RetryInstanceTaskRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.retryInstanceTask, hcClient);
    }

    /**
     * 查询实例任务详情
     *
     * 用户可以调用此接口查询设备接入实例任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTaskRequest 请求对象
     * @return CompletableFuture<ShowInstanceTaskResponse>
     */
    public CompletableFuture<ShowInstanceTaskResponse> showInstanceTaskAsync(ShowInstanceTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDMMeta.showInstanceTask);
    }

    /**
     * 查询实例任务详情
     *
     * 用户可以调用此接口查询设备接入实例任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTaskRequest 请求对象
     * @return AsyncInvoker<ShowInstanceTaskRequest, ShowInstanceTaskResponse>
     */
    public AsyncInvoker<ShowInstanceTaskRequest, ShowInstanceTaskResponse> showInstanceTaskAsyncInvoker(
        ShowInstanceTaskRequest request) {
        return new AsyncInvoker<>(request, IoTDMMeta.showInstanceTask, hcClient);
    }

}
