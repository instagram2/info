/*
 *  Copyright (c) 2014-2017 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package v1;

/**
 * @author Benjamin Kastelic
 * @since 2.3.0
 */
public class Seminar {

    private String[] clani;
    private String opis_projekta;
    private String[] mikrostoritve;
    private String[] github;
    private String[] travis;
    private String[] dockerhub;

    public void setTravis(String[] travis) {
        this.travis = travis;
    }

    public String getTravis() {
        return travis;
    }

    public void setClani(String[] clani) {
        this.clani = clani;
    }

    public String getClani() {
        return clani;
    }

    public void setDockerhub(String[] dockerhub) {
        this.dockerhub = dockerhub;
    }

    public String getDockerhub() {
        return dockerhub;
    }

    public void setGithub(String[] github) {
        this.github = github;
    }

    public String getGithub() {
        return github;
    }

    public void setMikrostoritve(String[] mikrostoritve) {
        this.mikrostoritve = mikrostoritve;
    }

    public String getMikrostoritve() {
        return mikrostoritve;
    }

    public void setOpis_projekta(String opis_projekta) {
        this.opis_projekta = opis_projekta;
    }

    public String getOpis_projekta() {
        return opis_projekta;
    }
}
