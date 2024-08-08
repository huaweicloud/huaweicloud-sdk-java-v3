package com.huaweicloud.sdk.iotdm.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iotdm.v5.model.BindInstanceTagsRequest;
import com.huaweicloud.sdk.iotdm.v5.model.BindInstanceTagsResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ChangeInstanceChargeModeRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ChangeInstanceChargeModeResponse;
import com.huaweicloud.sdk.iotdm.v5.model.CreateInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.CreateInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstancesRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstancesResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ShowInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ShowInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.UnbindInstanceTagsRequest;
import com.huaweicloud.sdk.iotdm.v5.model.UnbindInstanceTagsResponse;
import com.huaweicloud.sdk.iotdm.v5.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.UpdateInstanceResponse;

public class IoTDMClient {

    protected HcClient hcClient;

    public IoTDMClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTDMClient> newBuilder() {
        ClientBuilder<IoTDMClient> clientBuilder = new ClientBuilder<>(IoTDMClient::new);
        return clientBuilder;
    }

    /**
     * 添加实例标签
     *
     * 添加实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindInstanceTagsRequest 请求对象
     * @return BindInstanceTagsResponse
     */
    public BindInstanceTagsResponse bindInstanceTags(BindInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDMMeta.bindInstanceTags);
    }

    /**
     * 添加实例标签
     *
     * 添加实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindInstanceTagsRequest 请求对象
     * @return SyncInvoker<BindInstanceTagsRequest, BindInstanceTagsResponse>
     */
    public SyncInvoker<BindInstanceTagsRequest, BindInstanceTagsResponse> bindInstanceTagsInvoker(
        BindInstanceTagsRequest request) {
        return new SyncInvoker<>(request, IoTDMMeta.bindInstanceTags, hcClient);
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
     * @return ChangeInstanceChargeModeResponse
     */
    public ChangeInstanceChargeModeResponse changeInstanceChargeMode(ChangeInstanceChargeModeRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDMMeta.changeInstanceChargeMode);
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
     * @return SyncInvoker<ChangeInstanceChargeModeRequest, ChangeInstanceChargeModeResponse>
     */
    public SyncInvoker<ChangeInstanceChargeModeRequest, ChangeInstanceChargeModeResponse> changeInstanceChargeModeInvoker(
        ChangeInstanceChargeModeRequest request) {
        return new SyncInvoker<>(request, IoTDMMeta.changeInstanceChargeMode, hcClient);
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
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDMMeta.createInstance);
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
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, IoTDMMeta.createInstance, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除设备接入实例。约束：此接口仅支持删除按需计费的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDMMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除设备接入实例。约束：此接口仅支持删除按需计费的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, IoTDMMeta.deleteInstance, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 用户可以调用此接口查询设备接入实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDMMeta.listInstances);
    }

    /**
     * 查询实例列表
     *
     * 用户可以调用此接口查询设备接入实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, IoTDMMeta.listInstances, hcClient);
    }

    /**
     * 修改实例规格信息
     *
     * 修改设备接入实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDMMeta.resizeInstance);
    }

    /**
     * 修改实例规格信息
     *
     * 修改设备接入实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<>(request, IoTDMMeta.resizeInstance, hcClient);
    }

    /**
     * 查询实例详情
     *
     * 查询设备接入实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDMMeta.showInstance);
    }

    /**
     * 查询实例详情
     *
     * 查询设备接入实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, IoTDMMeta.showInstance, hcClient);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindInstanceTagsRequest 请求对象
     * @return UnbindInstanceTagsResponse
     */
    public UnbindInstanceTagsResponse unbindInstanceTags(UnbindInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDMMeta.unbindInstanceTags);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindInstanceTagsRequest 请求对象
     * @return SyncInvoker<UnbindInstanceTagsRequest, UnbindInstanceTagsResponse>
     */
    public SyncInvoker<UnbindInstanceTagsRequest, UnbindInstanceTagsResponse> unbindInstanceTagsInvoker(
        UnbindInstanceTagsRequest request) {
        return new SyncInvoker<>(request, IoTDMMeta.unbindInstanceTags, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改设备接入实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDMMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改设备接入实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<>(request, IoTDMMeta.updateInstance, hcClient);
    }

}
