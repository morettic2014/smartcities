package br.com.moretic.vo;

// Generated by Hibernate Tools 4.0.0
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.*;

/**
 * Profile generated by hbm2java
 */
@Entity
@Table(name = "profile", schema = "public")
@XmlRootElement
public class Profile implements java.io.Serializable {

    @Id
    @SequenceGenerator(name = "profile_seq", sequenceName = "profile_idprofile_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_seq")
    @Column(name = "idprofile", unique = true, nullable = false)
    private int idprofile;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idprofile_organization", updatable = false, insertable = false)
    private Profile profile;

    @Column(name = "idprofile_organization", updatable = true, insertable = true)
    private Integer idProfileOrganization;

    @Column(name = "nm_user", nullable = false, length = 300)
    private String nmUser;

    @Column(name = "email", length = 200, unique = true)
    private String email;

    @Column(name = "password", length = 200)
    private String password;

    @Column(name = "cpf_cnpj", length = 200, unique = true)
    private String cpfCnpj;

    @Column(name = "online")
    private Boolean online;

    @JsonProperty
    private String bioText;

    public String getBioText() {
        return bioText;
    }

    public void setBioText(String bioText) {

        this.bioText = bioText;
    }

    //@Type(type="org.hibernate.type.BinaryType")
    @Column(name = "bio")
    byte[] bio;

    @JsonProperty()
    private ArrayList<UserLog> lLog;

    @JsonProperty()
    public ArrayList<UserLog> getlLog() {
        return lLog;
    }

    public Set<FtpClient> getMyFtps() {
        return myFtps;
    }

    public void setMyFtps(Set<FtpClient> myFtps) {
        this.myFtps = myFtps;
    }

    public void setlLog(ArrayList<UserLog> lLog) {
        this.lLog = lLog;
    }

    @Transient
    private Set<FileSource> mySources = new HashSet<FileSource>(0);

    @Transient
    private Set<FtpClient> myFtps = new HashSet<FtpClient>(0);

    @Transient
    private Set<DataSource> myDbs = new HashSet<DataSource>(0);

    public Set<FileSource> getMySources() {
        return mySources;
    }

    public Set<DataSource> getMyDbs() {
        return myDbs;
    }

    public void setMyDbs(Set<DataSource> myDbs) {
        this.myDbs = myDbs;
    }

    public void setMySources(Set<FileSource> mySources) {
        this.mySources = mySources;
    }

    @JsonProperty()
    @Temporal(TemporalType.DATE)
    @Column(name = "nascimento", length = 13)
    private Date nascimento;

    @Column(name = "telefone", length = 400)
    private String telefone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
    private Set<ShareView> shareViews = new HashSet<ShareView>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profileByProfileIdprofile")
    private Set<ProfileContact> profileContactsForProfileIdprofile = new HashSet<ProfileContact>(
            0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
    private Set<GroupHasProfile> groupHasProfiles = new HashSet<GroupHasProfile>(
            0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
    private Set<Profile> profiles = new HashSet<Profile>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
    private Set<SocialNetwork> socialNetworks = new HashSet<SocialNetwork>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
    private Set<Avatar> avatars = new HashSet<Avatar>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profileByProfileIdprofile1")
    private Set<ProfileContact> profileContactsForProfileIdprofile1 = new HashSet<ProfileContact>(
            0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
    private Set<ShareViewWith> shareViewWiths = new HashSet<ShareViewWith>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
    private Set<Adress> adresses = new HashSet<Adress>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
    private Set<SecurityInfo> securityInfo = new HashSet<SecurityInfo>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
    private Set<ProfileLang> profileLang = new HashSet<ProfileLang>(0);

    /*  public void addLanguage(String lang){
     Lang l = new Lang();
     l.setToken(lang);
     l.setLang(lang);
     }*/
    public Profile() {
        this.lLog = new ArrayList<UserLog>();
    }

    public Profile(int idprofile, String nmUser) {
        this.lLog = new ArrayList<UserLog>();
        this.idprofile = idprofile;
        this.nmUser = nmUser;
    }

    public Profile(int idprofile, Profile profile, String nmUser, String email,
            String password, String cpfCnpj, Boolean online,
            Set<ShareView> shareViews,
            Set<ProfileContact> profileContactsForProfileIdprofile,
            Set<GroupHasProfile> groupHasProfiles, Set<Profile> profiles,
            Set<SocialNetwork> socialNetworks, Set<Avatar> avatars,
            Set<ProfileContact> profileContactsForProfileIdprofile1,
            Set<ShareViewWith> shareViewWiths, Set<Adress> adresses,
            Set<SecurityInfo> securityInfo, Set<ProfileLang> profileLang) {
        this.lLog = new ArrayList<UserLog>();
        this.idprofile = idprofile;
        this.profile = profile;
        this.idProfileOrganization = profile.getProfile().getIdprofile();
        this.nmUser = nmUser;
        this.email = email;
        this.password = password;
        this.cpfCnpj = cpfCnpj;
        this.online = online;
        this.shareViews = shareViews;
        this.profileContactsForProfileIdprofile = profileContactsForProfileIdprofile;
        this.groupHasProfiles = groupHasProfiles;
        this.profiles = profiles;
        this.socialNetworks = socialNetworks;
        this.avatars = avatars;
        this.profileContactsForProfileIdprofile1 = profileContactsForProfileIdprofile1;
        this.shareViewWiths = shareViewWiths;
        this.adresses = adresses;
        this.securityInfo = securityInfo;
        this.profileLang = profileLang;
    }

    public int getIdprofile() {
        return this.idprofile;
    }

    public void setIdprofile(int idprofile) {
        this.idprofile = idprofile;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getNmUser() {
        return this.nmUser;
    }

    public void setNmUser(String nmUser) {
        this.nmUser = nmUser;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpfCnpj() {
        return this.cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Boolean getOnline() {
        return this.online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public byte[] getBio() {
        return bio;
    }

    public void setBio(byte[] bio) {

        String bText = new String(bio);
        this.bioText = bText;
        this.bio = bio;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @XmlTransient
    @JsonIgnore
    public Set<ShareView> getShareViews() {
        return this.shareViews;
    }

    public void setShareViews(Set<ShareView> shareViews) {
        this.shareViews = shareViews;
    }

    @XmlTransient
    @JsonIgnore
    public Set<ProfileContact> getProfileContactsForProfileIdprofile() {
        return this.profileContactsForProfileIdprofile;
    }

    public void setProfileContactsForProfileIdprofile(
            Set<ProfileContact> profileContactsForProfileIdprofile) {
        this.profileContactsForProfileIdprofile = profileContactsForProfileIdprofile;
    }

    @XmlTransient
    @JsonIgnore
    public Set<GroupHasProfile> getGroupHasProfiles() {
        return this.groupHasProfiles;
    }

    public void setGroupHasProfiles(Set<GroupHasProfile> groupHasProfiles) {
        this.groupHasProfiles = groupHasProfiles;
    }

    @XmlTransient
    @JsonIgnore
    public Set<Profile> getProfiles() {
        return this.profiles;
    }

    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
    }

    @XmlTransient
    @JsonIgnore
    public Set<SocialNetwork> getSocialNetworks() {
        return this.socialNetworks;
    }

    public void setSocialNetworks(Set<SocialNetwork> socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    //@XmlTransient
    //@JsonIgnore
    public Set<Avatar> getAvatars() {
        return this.avatars;
    }

    public void setAvatars(Set<Avatar> avatars) {
        this.avatars = avatars;
    }

    @XmlTransient
    @JsonIgnore
    public Set<ProfileContact> getProfileContactsForProfileIdprofile1() {
        return this.profileContactsForProfileIdprofile1;
    }

    public void setProfileContactsForProfileIdprofile1(
            Set<ProfileContact> profileContactsForProfileIdprofile1) {
        this.profileContactsForProfileIdprofile1 = profileContactsForProfileIdprofile1;
    }

    @XmlTransient
    @JsonIgnore
    public Set<ShareViewWith> getShareViewWiths() {
        return this.shareViewWiths;
    }

    public void setShareViewWiths(Set<ShareViewWith> shareViewWiths) {
        this.shareViewWiths = shareViewWiths;
    }

    //@XmlTransient
    //@JsonIgnore
    public Set<Adress> getAdresses() {
        return this.adresses;
    }

    public void setAdresses(Set<Adress> adresses) {
        this.adresses = adresses;
    }

    public Integer getIdProfileOrganization() {
        return idProfileOrganization;
    }

    public void setIdProfileOrganization(Integer idProfileOrganization) {
        this.idProfileOrganization = idProfileOrganization;
    }

    public Set<SecurityInfo> getSecurityInfo() {
        return securityInfo;
    }

    public void setSecurityInfo(Set<SecurityInfo> securityInfo) {
        this.securityInfo = securityInfo;
    }

    public Set<ProfileLang> getProfileLang() {
        return profileLang;
    }

    public void setProfileLang(Set<ProfileLang> profileLang) {
        this.profileLang = profileLang;
    }

}
