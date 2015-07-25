
package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UserPresence {

    @JsonProperty("ok")
    private Boolean ok;
    @JsonProperty("presence")
    private String presence;
    @JsonProperty("online")
    private Boolean online;
    @JsonProperty("auto_away")
    private Boolean autoAway;
    @JsonProperty("manual_away")
    private Boolean manualAway;
    @JsonProperty("connection_count")
    private Integer connectionCount;
    @JsonProperty("last_activity")
    private Integer lastActivity;
   
    /**
     * 
     * @return
     *     The ok
     */
    @JsonProperty("ok")
    public Boolean getOk() {
        return ok;
    }

    /**
     * 
     * @param ok
     *     The ok
     */
    @JsonProperty("ok")
    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    /**
     * 
     * @return
     *     The presence
     */
    @JsonProperty("presence")
    public String getPresence() {
        return presence;
    }

    /**
     * 
     * @param presence
     *     The presence
     */
    @JsonProperty("presence")
    public void setPresence(String presence) {
        this.presence = presence;
    }

    /**
     * 
     * @return
     *     The online
     */
    @JsonProperty("online")
    public Boolean getOnline() {
        return online;
    }

    /**
     * 
     * @param online
     *     The online
     */
    @JsonProperty("online")
    public void setOnline(Boolean online) {
        this.online = online;
    }

    /**
     * 
     * @return
     *     The autoAway
     */
    @JsonProperty("auto_away")
    public Boolean getAutoAway() {
        return autoAway;
    }

    /**
     * 
     * @param autoAway
     *     The auto_away
     */
    @JsonProperty("auto_away")
    public void setAutoAway(Boolean autoAway) {
        this.autoAway = autoAway;
    }

    /**
     * 
     * @return
     *     The manualAway
     */
    @JsonProperty("manual_away")
    public Boolean getManualAway() {
        return manualAway;
    }

    /**
     * 
     * @param manualAway
     *     The manual_away
     */
    @JsonProperty("manual_away")
    public void setManualAway(Boolean manualAway) {
        this.manualAway = manualAway;
    }

    /**
     * 
     * @return
     *     The connectionCount
     */
    @JsonProperty("connection_count")
    public Integer getConnectionCount() {
        return connectionCount;
    }

    /**
     * 
     * @param connectionCount
     *     The connection_count
     */
    @JsonProperty("connection_count")
    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    /**
     * 
     * @return
     *     The lastActivity
     */
    @JsonProperty("last_activity")
    public Integer getLastActivity() {
        return lastActivity;
    }

    /**
     * 
     * @param lastActivity
     *     The last_activity
     */
    @JsonProperty("last_activity")
    public void setLastActivity(Integer lastActivity) {
        this.lastActivity = lastActivity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }



}
