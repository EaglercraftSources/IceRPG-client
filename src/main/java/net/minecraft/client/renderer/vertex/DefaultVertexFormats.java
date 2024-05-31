package net.minecraft.client.renderer.vertex;

import net.lax1dude.eaglercraft.v1_8.opengl.VertexFormat;

/**+
 * This portion of EaglercraftX contains deobfuscated Minecraft 1.8 source code.
 * 
 * Minecraft 1.8.8 bytecode is (c) 2015 Mojang AB. "Do not distribute!"
 * Mod Coder Pack v9.18 deobfuscation configs are (c) Copyright by the MCP Team
 * 
 * EaglercraftX 1.8 patch files (c) 2022-2024 lax1dude, ayunami2000. All Rights Reserved.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
public class DefaultVertexFormats {
	public static final VertexFormat BLOCK = VertexFormat.BLOCK;
	public static final VertexFormat ITEM = VertexFormat.ITEM;
	public static final VertexFormat OLDMODEL_POSITION_TEX_NORMAL = VertexFormat.OLDMODEL_POSITION_TEX_NORMAL;
	public static final VertexFormat PARTICLE_POSITION_TEX_COLOR_LMAP = VertexFormat.PARTICLE_POSITION_TEX_COLOR_LMAP;
	public static final VertexFormat POSITION = VertexFormat.POSITION;
	public static final VertexFormat POSITION_COLOR = VertexFormat.POSITION_COLOR;
	public static final VertexFormat POSITION_TEX = VertexFormat.POSITION_TEX;
	public static final VertexFormat POSITION_NORMAL = VertexFormat.POSITION_NORMAL;
	public static final VertexFormat POSITION_TEX_COLOR = VertexFormat.POSITION_TEX_COLOR;
	public static final VertexFormat POSITION_TEX_NORMAL = VertexFormat.POSITION_TEX_NORMAL;
	public static final VertexFormat POSITION_TEX_LMAP_COLOR = VertexFormat.POSITION_TEX_LMAP_COLOR;
	public static final VertexFormat POSITION_TEX_COLOR_NORMAL = VertexFormat.POSITION_TEX_COLOR_NORMAL;
}