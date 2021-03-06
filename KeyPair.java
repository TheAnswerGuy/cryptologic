/*
 * Copyright (C) 2016 TheAnswerGuy
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package rsa;
public class KeyPair extends RSA{
    private final Key publicKey,privateKey;
    public KeyPair(Key publicKey,Key privateKey){
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }
    protected KeyPair(int bufferSize){
        generateKeys(bufferSize);
        publicKey = new Key(getE(),getN());
        privateKey = new Key(getD(),getN());
    }
    public Key getPublic(){
        return publicKey;
    }
    public Key getPrivate(){
        return privateKey;
    }
    public boolean isBoth(){
        return privateKey != null && publicKey != null;
    }
}
