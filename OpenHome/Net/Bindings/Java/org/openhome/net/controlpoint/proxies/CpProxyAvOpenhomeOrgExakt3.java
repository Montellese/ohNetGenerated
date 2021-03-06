package org.openhome.net.controlpoint.proxies;

import java.util.LinkedList;
import java.util.List;

import org.openhome.net.controlpoint.*;
import org.openhome.net.controlpoint.proxies.CpProxyAvOpenhomeOrgExakt3.*;
import org.openhome.net.core.*;

    
interface ICpProxyAvOpenhomeOrgExakt3 extends ICpProxy
{
    public String syncDeviceList();
    public void beginDeviceList(ICpProxyListener aCallback);
    public String endDeviceList(long aAsyncHandle);
    public String syncDeviceSettings(String aDeviceId);
    public void beginDeviceSettings(String aDeviceId, ICpProxyListener aCallback);
    public String endDeviceSettings(long aAsyncHandle);
    public String syncConnectionStatus();
    public void beginConnectionStatus(ICpProxyListener aCallback);
    public String endConnectionStatus(long aAsyncHandle);
    public void syncSet(String aDeviceId, long aBankId, String aFileUri, boolean aMute, boolean aPersist);
    public void beginSet(String aDeviceId, long aBankId, String aFileUri, boolean aMute, boolean aPersist, ICpProxyListener aCallback);
    public void endSet(long aAsyncHandle);
    public void syncReprogram(String aDeviceId, String aFileUri);
    public void beginReprogram(String aDeviceId, String aFileUri, ICpProxyListener aCallback);
    public void endReprogram(long aAsyncHandle);
    public void syncReprogramFallback(String aDeviceId, String aFileUri);
    public void beginReprogramFallback(String aDeviceId, String aFileUri, ICpProxyListener aCallback);
    public void endReprogramFallback(long aAsyncHandle);
    public String syncChannelMap();
    public void beginChannelMap(ICpProxyListener aCallback);
    public String endChannelMap(long aAsyncHandle);
    public void syncSetChannelMap(String aChannelMap);
    public void beginSetChannelMap(String aChannelMap, ICpProxyListener aCallback);
    public void endSetChannelMap(long aAsyncHandle);
    public String syncAudioChannels();
    public void beginAudioChannels(ICpProxyListener aCallback);
    public String endAudioChannels(long aAsyncHandle);
    public void syncSetAudioChannels(String aAudioChannels);
    public void beginSetAudioChannels(String aAudioChannels, ICpProxyListener aCallback);
    public void endSetAudioChannels(long aAsyncHandle);
    public String syncVersion();
    public void beginVersion(ICpProxyListener aCallback);
    public String endVersion(long aAsyncHandle);
    public void setPropertyDeviceListChanged(IPropertyChangeListener aDeviceListChanged);
    public String getPropertyDeviceList();
    public void setPropertyConnectionStatusChanged(IPropertyChangeListener aConnectionStatusChanged);
    public String getPropertyConnectionStatus();
    public void setPropertyChannelMapChanged(IPropertyChangeListener aChannelMapChanged);
    public String getPropertyChannelMap();
    public void setPropertyAudioChannelsChanged(IPropertyChangeListener aAudioChannelsChanged);
    public String getPropertyAudioChannels();
    public void setPropertyVersionChanged(IPropertyChangeListener aVersionChanged);
    public String getPropertyVersion();
}

class SyncDeviceListAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;
    private String iList;

    public SyncDeviceListAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    public String getList()
    {
        return iList;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        String result = iService.endDeviceList(aAsyncHandle);
        
        iList = result;
    }
}

class SyncDeviceSettingsAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;
    private String iSettings;

    public SyncDeviceSettingsAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    public String getSettings()
    {
        return iSettings;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        String result = iService.endDeviceSettings(aAsyncHandle);
        
        iSettings = result;
    }
}

class SyncConnectionStatusAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;
    private String iConnectionStatus;

    public SyncConnectionStatusAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    public String getConnectionStatus()
    {
        return iConnectionStatus;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        String result = iService.endConnectionStatus(aAsyncHandle);
        
        iConnectionStatus = result;
    }
}

class SyncSetAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;

    public SyncSetAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        iService.endSet(aAsyncHandle);
        
    }
}

class SyncReprogramAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;

    public SyncReprogramAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        iService.endReprogram(aAsyncHandle);
        
    }
}

class SyncReprogramFallbackAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;

    public SyncReprogramFallbackAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        iService.endReprogramFallback(aAsyncHandle);
        
    }
}

class SyncChannelMapAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;
    private String iChannelMap;

    public SyncChannelMapAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    public String getChannelMap()
    {
        return iChannelMap;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        String result = iService.endChannelMap(aAsyncHandle);
        
        iChannelMap = result;
    }
}

class SyncSetChannelMapAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;

    public SyncSetChannelMapAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        iService.endSetChannelMap(aAsyncHandle);
        
    }
}

class SyncAudioChannelsAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;
    private String iAudioChannels;

    public SyncAudioChannelsAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    public String getAudioChannels()
    {
        return iAudioChannels;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        String result = iService.endAudioChannels(aAsyncHandle);
        
        iAudioChannels = result;
    }
}

class SyncSetAudioChannelsAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;

    public SyncSetAudioChannelsAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        iService.endSetAudioChannels(aAsyncHandle);
        
    }
}

class SyncVersionAvOpenhomeOrgExakt3 extends SyncProxyAction
{
    private CpProxyAvOpenhomeOrgExakt3 iService;
    private String iVersion;

    public SyncVersionAvOpenhomeOrgExakt3(CpProxyAvOpenhomeOrgExakt3 aProxy)
    {
        iService = aProxy;
    }
    public String getVersion()
    {
        return iVersion;
    }
    protected void completeRequest(long aAsyncHandle)
    {
        String result = iService.endVersion(aAsyncHandle);
        
        iVersion = result;
    }
}

/**
 * Proxy for the av.openhome.org:Exakt:3 UPnP service
 */
public class CpProxyAvOpenhomeOrgExakt3 extends CpProxy implements ICpProxyAvOpenhomeOrgExakt3
{

    private Action iActionDeviceList;
    private Action iActionDeviceSettings;
    private Action iActionConnectionStatus;
    private Action iActionSet;
    private Action iActionReprogram;
    private Action iActionReprogramFallback;
    private Action iActionChannelMap;
    private Action iActionSetChannelMap;
    private Action iActionAudioChannels;
    private Action iActionSetAudioChannels;
    private Action iActionVersion;
    private PropertyString iDeviceList;
    private PropertyString iConnectionStatus;
    private PropertyString iChannelMap;
    private PropertyString iAudioChannels;
    private PropertyString iVersion;
    private IPropertyChangeListener iDeviceListChanged;
    private IPropertyChangeListener iConnectionStatusChanged;
    private IPropertyChangeListener iChannelMapChanged;
    private IPropertyChangeListener iAudioChannelsChanged;
    private IPropertyChangeListener iVersionChanged;
    private Object iPropertyLock;

    /**
     * Constructor.
     * Use {@link #subscribe}/{@link #unsubscribe} to enable/disable querying of state variable and reporting of their changes.
     *
     * @param aDevice   the device to use.
     */

    public CpProxyAvOpenhomeOrgExakt3(CpDevice aDevice)
    {
        super("av-openhome-org", "Exakt", 3, aDevice);
        Parameter param;
        List<String> allowedValues = new LinkedList<String>();

        iActionDeviceList = new Action("DeviceList");
        param = new ParameterString("List", allowedValues);
        iActionDeviceList.addOutputParameter(param);

        iActionDeviceSettings = new Action("DeviceSettings");
        param = new ParameterString("DeviceId", allowedValues);
        iActionDeviceSettings.addInputParameter(param);
        param = new ParameterString("Settings", allowedValues);
        iActionDeviceSettings.addOutputParameter(param);

        iActionConnectionStatus = new Action("ConnectionStatus");
        param = new ParameterString("ConnectionStatus", allowedValues);
        iActionConnectionStatus.addOutputParameter(param);

        iActionSet = new Action("Set");
        param = new ParameterString("DeviceId", allowedValues);
        iActionSet.addInputParameter(param);
        param = new ParameterUint("BankId");
        iActionSet.addInputParameter(param);
        param = new ParameterString("FileUri", allowedValues);
        iActionSet.addInputParameter(param);
        param = new ParameterBool("Mute");
        iActionSet.addInputParameter(param);
        param = new ParameterBool("Persist");
        iActionSet.addInputParameter(param);

        iActionReprogram = new Action("Reprogram");
        param = new ParameterString("DeviceId", allowedValues);
        iActionReprogram.addInputParameter(param);
        param = new ParameterString("FileUri", allowedValues);
        iActionReprogram.addInputParameter(param);

        iActionReprogramFallback = new Action("ReprogramFallback");
        param = new ParameterString("DeviceId", allowedValues);
        iActionReprogramFallback.addInputParameter(param);
        param = new ParameterString("FileUri", allowedValues);
        iActionReprogramFallback.addInputParameter(param);

        iActionChannelMap = new Action("ChannelMap");
        param = new ParameterString("ChannelMap", allowedValues);
        iActionChannelMap.addOutputParameter(param);

        iActionSetChannelMap = new Action("SetChannelMap");
        param = new ParameterString("ChannelMap", allowedValues);
        iActionSetChannelMap.addInputParameter(param);

        iActionAudioChannels = new Action("AudioChannels");
        param = new ParameterString("AudioChannels", allowedValues);
        iActionAudioChannels.addOutputParameter(param);

        iActionSetAudioChannels = new Action("SetAudioChannels");
        param = new ParameterString("AudioChannels", allowedValues);
        iActionSetAudioChannels.addInputParameter(param);

        iActionVersion = new Action("Version");
        param = new ParameterString("Version", allowedValues);
        iActionVersion.addOutputParameter(param);

        iDeviceListChanged = new PropertyChangeListener();
        iDeviceList = new PropertyString("DeviceList",
            new PropertyChangeListener() {
                public void notifyChange() {
                    deviceListPropertyChanged();
                }
            }
        );
        addProperty(iDeviceList);
        iConnectionStatusChanged = new PropertyChangeListener();
        iConnectionStatus = new PropertyString("ConnectionStatus",
            new PropertyChangeListener() {
                public void notifyChange() {
                    connectionStatusPropertyChanged();
                }
            }
        );
        addProperty(iConnectionStatus);
        iChannelMapChanged = new PropertyChangeListener();
        iChannelMap = new PropertyString("ChannelMap",
            new PropertyChangeListener() {
                public void notifyChange() {
                    channelMapPropertyChanged();
                }
            }
        );
        addProperty(iChannelMap);
        iAudioChannelsChanged = new PropertyChangeListener();
        iAudioChannels = new PropertyString("AudioChannels",
            new PropertyChangeListener() {
                public void notifyChange() {
                    audioChannelsPropertyChanged();
                }
            }
        );
        addProperty(iAudioChannels);
        iVersionChanged = new PropertyChangeListener();
        iVersion = new PropertyString("Version",
            new PropertyChangeListener() {
                public void notifyChange() {
                    versionPropertyChanged();
                }
            }
        );
        addProperty(iVersion);
        iPropertyLock = new Object();
    }
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     *
     * @return the result of the invoked action.
     */
    public String syncDeviceList()
    {
        SyncDeviceListAvOpenhomeOrgExakt3 sync = new SyncDeviceListAvOpenhomeOrgExakt3(this);
        beginDeviceList(sync.getListener());
        sync.waitToComplete();
        sync.reportError();

        return sync.getList();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endDeviceList}.
     * 
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginDeviceList(ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionDeviceList, aCallback);
        int outIndex = 0;
        invocation.addOutput(new ArgumentString((ParameterString)iActionDeviceList.getOutputParameter(outIndex++)));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginDeviceList} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginDeviceList} method.
     * @return the result of the previously invoked action.
     */
    public String endDeviceList(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
        int index = 0;
        String list = Invocation.getOutputString(aAsyncHandle, index++);
        return list;
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     *
     * @return the result of the invoked action.
     */
    public String syncDeviceSettings(String aDeviceId)
    {
        SyncDeviceSettingsAvOpenhomeOrgExakt3 sync = new SyncDeviceSettingsAvOpenhomeOrgExakt3(this);
        beginDeviceSettings(aDeviceId, sync.getListener());
        sync.waitToComplete();
        sync.reportError();

        return sync.getSettings();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endDeviceSettings}.
     * 
     * @param aDeviceId
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginDeviceSettings(String aDeviceId, ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionDeviceSettings, aCallback);
        int inIndex = 0;
        invocation.addInput(new ArgumentString((ParameterString)iActionDeviceSettings.getInputParameter(inIndex++), aDeviceId));
        int outIndex = 0;
        invocation.addOutput(new ArgumentString((ParameterString)iActionDeviceSettings.getOutputParameter(outIndex++)));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginDeviceSettings} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginDeviceSettings} method.
     * @return the result of the previously invoked action.
     */
    public String endDeviceSettings(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
        int index = 0;
        String settings = Invocation.getOutputString(aAsyncHandle, index++);
        return settings;
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     *
     * @return the result of the invoked action.
     */
    public String syncConnectionStatus()
    {
        SyncConnectionStatusAvOpenhomeOrgExakt3 sync = new SyncConnectionStatusAvOpenhomeOrgExakt3(this);
        beginConnectionStatus(sync.getListener());
        sync.waitToComplete();
        sync.reportError();

        return sync.getConnectionStatus();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endConnectionStatus}.
     * 
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginConnectionStatus(ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionConnectionStatus, aCallback);
        int outIndex = 0;
        invocation.addOutput(new ArgumentString((ParameterString)iActionConnectionStatus.getOutputParameter(outIndex++)));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginConnectionStatus} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginConnectionStatus} method.
     * @return the result of the previously invoked action.
     */
    public String endConnectionStatus(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
        int index = 0;
        String connectionStatus = Invocation.getOutputString(aAsyncHandle, index++);
        return connectionStatus;
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     */
    public void syncSet(String aDeviceId, long aBankId, String aFileUri, boolean aMute, boolean aPersist)
    {
        SyncSetAvOpenhomeOrgExakt3 sync = new SyncSetAvOpenhomeOrgExakt3(this);
        beginSet(aDeviceId, aBankId, aFileUri, aMute, aPersist, sync.getListener());
        sync.waitToComplete();
        sync.reportError();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endSet}.
     * 
     * @param aDeviceId
     * @param aBankId
     * @param aFileUri
     * @param aMute
     * @param aPersist
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginSet(String aDeviceId, long aBankId, String aFileUri, boolean aMute, boolean aPersist, ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionSet, aCallback);
        int inIndex = 0;
        invocation.addInput(new ArgumentString((ParameterString)iActionSet.getInputParameter(inIndex++), aDeviceId));
        invocation.addInput(new ArgumentUint((ParameterUint)iActionSet.getInputParameter(inIndex++), aBankId));
        invocation.addInput(new ArgumentString((ParameterString)iActionSet.getInputParameter(inIndex++), aFileUri));
        invocation.addInput(new ArgumentBool((ParameterBool)iActionSet.getInputParameter(inIndex++), aMute));
        invocation.addInput(new ArgumentBool((ParameterBool)iActionSet.getInputParameter(inIndex++), aPersist));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginSet} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginSet} method.
     */
    public void endSet(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     */
    public void syncReprogram(String aDeviceId, String aFileUri)
    {
        SyncReprogramAvOpenhomeOrgExakt3 sync = new SyncReprogramAvOpenhomeOrgExakt3(this);
        beginReprogram(aDeviceId, aFileUri, sync.getListener());
        sync.waitToComplete();
        sync.reportError();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endReprogram}.
     * 
     * @param aDeviceId
     * @param aFileUri
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginReprogram(String aDeviceId, String aFileUri, ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionReprogram, aCallback);
        int inIndex = 0;
        invocation.addInput(new ArgumentString((ParameterString)iActionReprogram.getInputParameter(inIndex++), aDeviceId));
        invocation.addInput(new ArgumentString((ParameterString)iActionReprogram.getInputParameter(inIndex++), aFileUri));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginReprogram} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginReprogram} method.
     */
    public void endReprogram(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     */
    public void syncReprogramFallback(String aDeviceId, String aFileUri)
    {
        SyncReprogramFallbackAvOpenhomeOrgExakt3 sync = new SyncReprogramFallbackAvOpenhomeOrgExakt3(this);
        beginReprogramFallback(aDeviceId, aFileUri, sync.getListener());
        sync.waitToComplete();
        sync.reportError();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endReprogramFallback}.
     * 
     * @param aDeviceId
     * @param aFileUri
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginReprogramFallback(String aDeviceId, String aFileUri, ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionReprogramFallback, aCallback);
        int inIndex = 0;
        invocation.addInput(new ArgumentString((ParameterString)iActionReprogramFallback.getInputParameter(inIndex++), aDeviceId));
        invocation.addInput(new ArgumentString((ParameterString)iActionReprogramFallback.getInputParameter(inIndex++), aFileUri));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginReprogramFallback} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginReprogramFallback} method.
     */
    public void endReprogramFallback(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     *
     * @return the result of the invoked action.
     */
    public String syncChannelMap()
    {
        SyncChannelMapAvOpenhomeOrgExakt3 sync = new SyncChannelMapAvOpenhomeOrgExakt3(this);
        beginChannelMap(sync.getListener());
        sync.waitToComplete();
        sync.reportError();

        return sync.getChannelMap();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endChannelMap}.
     * 
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginChannelMap(ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionChannelMap, aCallback);
        int outIndex = 0;
        invocation.addOutput(new ArgumentString((ParameterString)iActionChannelMap.getOutputParameter(outIndex++)));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginChannelMap} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginChannelMap} method.
     * @return the result of the previously invoked action.
     */
    public String endChannelMap(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
        int index = 0;
        String channelMap = Invocation.getOutputString(aAsyncHandle, index++);
        return channelMap;
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     */
    public void syncSetChannelMap(String aChannelMap)
    {
        SyncSetChannelMapAvOpenhomeOrgExakt3 sync = new SyncSetChannelMapAvOpenhomeOrgExakt3(this);
        beginSetChannelMap(aChannelMap, sync.getListener());
        sync.waitToComplete();
        sync.reportError();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endSetChannelMap}.
     * 
     * @param aChannelMap
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginSetChannelMap(String aChannelMap, ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionSetChannelMap, aCallback);
        int inIndex = 0;
        invocation.addInput(new ArgumentString((ParameterString)iActionSetChannelMap.getInputParameter(inIndex++), aChannelMap));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginSetChannelMap} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginSetChannelMap} method.
     */
    public void endSetChannelMap(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     *
     * @return the result of the invoked action.
     */
    public String syncAudioChannels()
    {
        SyncAudioChannelsAvOpenhomeOrgExakt3 sync = new SyncAudioChannelsAvOpenhomeOrgExakt3(this);
        beginAudioChannels(sync.getListener());
        sync.waitToComplete();
        sync.reportError();

        return sync.getAudioChannels();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endAudioChannels}.
     * 
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginAudioChannels(ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionAudioChannels, aCallback);
        int outIndex = 0;
        invocation.addOutput(new ArgumentString((ParameterString)iActionAudioChannels.getOutputParameter(outIndex++)));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginAudioChannels} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginAudioChannels} method.
     * @return the result of the previously invoked action.
     */
    public String endAudioChannels(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
        int index = 0;
        String audioChannels = Invocation.getOutputString(aAsyncHandle, index++);
        return audioChannels;
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     */
    public void syncSetAudioChannels(String aAudioChannels)
    {
        SyncSetAudioChannelsAvOpenhomeOrgExakt3 sync = new SyncSetAudioChannelsAvOpenhomeOrgExakt3(this);
        beginSetAudioChannels(aAudioChannels, sync.getListener());
        sync.waitToComplete();
        sync.reportError();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endSetAudioChannels}.
     * 
     * @param aAudioChannels
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginSetAudioChannels(String aAudioChannels, ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionSetAudioChannels, aCallback);
        int inIndex = 0;
        invocation.addInput(new ArgumentString((ParameterString)iActionSetAudioChannels.getInputParameter(inIndex++), aAudioChannels));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginSetAudioChannels} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginSetAudioChannels} method.
     */
    public void endSetAudioChannels(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
    }
        
    /**
     * Invoke the action synchronously.
     * Blocks until the action has been processed on the device and sets any
     * output arguments.
     *
     * @return the result of the invoked action.
     */
    public String syncVersion()
    {
        SyncVersionAvOpenhomeOrgExakt3 sync = new SyncVersionAvOpenhomeOrgExakt3(this);
        beginVersion(sync.getListener());
        sync.waitToComplete();
        sync.reportError();

        return sync.getVersion();
    }
    
    /**
     * Invoke the action asynchronously.
     * Returns immediately and will run the client-specified callback when the
     * action later completes.  Any output arguments can then be retrieved by
     * calling {@link #endVersion}.
     * 
     * @param aCallback listener to call back when action completes.
     *                  This is guaranteed to be run but may indicate an error.
     */
    public void beginVersion(ICpProxyListener aCallback)
    {
        Invocation invocation = iService.getInvocation(iActionVersion, aCallback);
        int outIndex = 0;
        invocation.addOutput(new ArgumentString((ParameterString)iActionVersion.getOutputParameter(outIndex++)));
        iService.invokeAction(invocation);
    }

    /**
     * Retrieve the output arguments from an asynchronously invoked action.
     * This may only be called from the callback set in the
     * {@link #beginVersion} method.
     *
     * @param aAsyncHandle  argument passed to the delegate set in the
     *          {@link #beginVersion} method.
     * @return the result of the previously invoked action.
     */
    public String endVersion(long aAsyncHandle)
    {
        ProxyError errObj = Invocation.error(aAsyncHandle);
        if (errObj != null)
        {
            throw errObj;
        }
        int index = 0;
        String version = Invocation.getOutputString(aAsyncHandle, index++);
        return version;
    }
        
    /**
     * Set a delegate to be run when the DeviceList state variable changes.
     * Callbacks may be run in different threads but callbacks for a
     * CpProxyAvOpenhomeOrgExakt3 instance will not overlap.
     *
     * @param aDeviceListChanged   the listener to call back when the state
     *          variable changes.
     */
    public void setPropertyDeviceListChanged(IPropertyChangeListener aDeviceListChanged)
    {
        synchronized (iPropertyLock)
        {
            iDeviceListChanged = aDeviceListChanged;
        }
    }

    private void deviceListPropertyChanged()
    {
        synchronized (iPropertyLock)
        {
            reportEvent(iDeviceListChanged);
        }
    }
    /**
     * Set a delegate to be run when the ConnectionStatus state variable changes.
     * Callbacks may be run in different threads but callbacks for a
     * CpProxyAvOpenhomeOrgExakt3 instance will not overlap.
     *
     * @param aConnectionStatusChanged   the listener to call back when the state
     *          variable changes.
     */
    public void setPropertyConnectionStatusChanged(IPropertyChangeListener aConnectionStatusChanged)
    {
        synchronized (iPropertyLock)
        {
            iConnectionStatusChanged = aConnectionStatusChanged;
        }
    }

    private void connectionStatusPropertyChanged()
    {
        synchronized (iPropertyLock)
        {
            reportEvent(iConnectionStatusChanged);
        }
    }
    /**
     * Set a delegate to be run when the ChannelMap state variable changes.
     * Callbacks may be run in different threads but callbacks for a
     * CpProxyAvOpenhomeOrgExakt3 instance will not overlap.
     *
     * @param aChannelMapChanged   the listener to call back when the state
     *          variable changes.
     */
    public void setPropertyChannelMapChanged(IPropertyChangeListener aChannelMapChanged)
    {
        synchronized (iPropertyLock)
        {
            iChannelMapChanged = aChannelMapChanged;
        }
    }

    private void channelMapPropertyChanged()
    {
        synchronized (iPropertyLock)
        {
            reportEvent(iChannelMapChanged);
        }
    }
    /**
     * Set a delegate to be run when the AudioChannels state variable changes.
     * Callbacks may be run in different threads but callbacks for a
     * CpProxyAvOpenhomeOrgExakt3 instance will not overlap.
     *
     * @param aAudioChannelsChanged   the listener to call back when the state
     *          variable changes.
     */
    public void setPropertyAudioChannelsChanged(IPropertyChangeListener aAudioChannelsChanged)
    {
        synchronized (iPropertyLock)
        {
            iAudioChannelsChanged = aAudioChannelsChanged;
        }
    }

    private void audioChannelsPropertyChanged()
    {
        synchronized (iPropertyLock)
        {
            reportEvent(iAudioChannelsChanged);
        }
    }
    /**
     * Set a delegate to be run when the Version state variable changes.
     * Callbacks may be run in different threads but callbacks for a
     * CpProxyAvOpenhomeOrgExakt3 instance will not overlap.
     *
     * @param aVersionChanged   the listener to call back when the state
     *          variable changes.
     */
    public void setPropertyVersionChanged(IPropertyChangeListener aVersionChanged)
    {
        synchronized (iPropertyLock)
        {
            iVersionChanged = aVersionChanged;
        }
    }

    private void versionPropertyChanged()
    {
        synchronized (iPropertyLock)
        {
            reportEvent(iVersionChanged);
        }
    }

    /**
     * Query the value of the DeviceList property.
     * This function is thread-safe and can only be called if {@link 
     * #subscribe} has been called and a first eventing callback received
     * more recently than any call to {@link #unsubscribe}.
     *
     * @return  value of the DeviceList property.
     */
    public String getPropertyDeviceList()
    {
        propertyReadLock();
        String val = iDeviceList.getValue();
        propertyReadUnlock();
        return val;
    }
    
    /**
     * Query the value of the ConnectionStatus property.
     * This function is thread-safe and can only be called if {@link 
     * #subscribe} has been called and a first eventing callback received
     * more recently than any call to {@link #unsubscribe}.
     *
     * @return  value of the ConnectionStatus property.
     */
    public String getPropertyConnectionStatus()
    {
        propertyReadLock();
        String val = iConnectionStatus.getValue();
        propertyReadUnlock();
        return val;
    }
    
    /**
     * Query the value of the ChannelMap property.
     * This function is thread-safe and can only be called if {@link 
     * #subscribe} has been called and a first eventing callback received
     * more recently than any call to {@link #unsubscribe}.
     *
     * @return  value of the ChannelMap property.
     */
    public String getPropertyChannelMap()
    {
        propertyReadLock();
        String val = iChannelMap.getValue();
        propertyReadUnlock();
        return val;
    }
    
    /**
     * Query the value of the AudioChannels property.
     * This function is thread-safe and can only be called if {@link 
     * #subscribe} has been called and a first eventing callback received
     * more recently than any call to {@link #unsubscribe}.
     *
     * @return  value of the AudioChannels property.
     */
    public String getPropertyAudioChannels()
    {
        propertyReadLock();
        String val = iAudioChannels.getValue();
        propertyReadUnlock();
        return val;
    }
    
    /**
     * Query the value of the Version property.
     * This function is thread-safe and can only be called if {@link 
     * #subscribe} has been called and a first eventing callback received
     * more recently than any call to {@link #unsubscribe}.
     *
     * @return  value of the Version property.
     */
    public String getPropertyVersion()
    {
        propertyReadLock();
        String val = iVersion.getValue();
        propertyReadUnlock();
        return val;
    }
    
    /**
     * Dispose of this control point proxy.
     * Must be called for each class instance.
     * Must be called before <tt>Library.close()</tt>.
     */
    public void dispose()
    {
        synchronized (this)
        {
            if (iHandle == 0)
            {
                return;
            }
            disposeProxy();
            iHandle = 0;
            iActionDeviceList.destroy();
            iActionDeviceSettings.destroy();
            iActionConnectionStatus.destroy();
            iActionSet.destroy();
            iActionReprogram.destroy();
            iActionReprogramFallback.destroy();
            iActionChannelMap.destroy();
            iActionSetChannelMap.destroy();
            iActionAudioChannels.destroy();
            iActionSetAudioChannels.destroy();
            iActionVersion.destroy();
            iDeviceList.destroy();
            iConnectionStatus.destroy();
            iChannelMap.destroy();
            iAudioChannels.destroy();
            iVersion.destroy();
        }
    }
}

